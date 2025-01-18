import chalk from "chalk";
import { copyFileSync, mkdirSync, readdirSync, statSync } from "node:fs";
import { exit, stdout } from "node:process";
import { parseArgs } from "node:util";
import { problemProperties } from "../src/properties.ts";
import {
  topicValues,
  type Problem,
  type ProblemSet,
  type Topic,
} from "../src/types.ts";

const BASEDIR = new URL(".", import.meta.url).pathname;

console.log(chalk.bold("\nCode Practice"));

const DEFAULT_NUMBER = 1;

if (Bun.argv.includes("--help") || Bun.argv.includes("-h")) {
  console.log("  Generate test files for leetcode problems.");
  console.log("");
  console.log(chalk.gray("Usage:"));
  console.log("  deno run scripts/generate.ts [options]");
  console.log("");
  console.log(chalk.gray("Options:"));
  console.log("  --help, -h           Show this message");
  console.log(
    "  --topic -t           Only generate test files for specific topic (array, two-pointers etc.)"
  );
  console.log("  --list-topics -lt    List available topics");
  console.log(
    "  --set -s             Only generate test files for specific set (ti150 etc.)"
  );
  console.log(
    "  --difficulty -d      Only generate test files for specific difficulty (easy, medium, hard)"
  );
  console.log(
    "  --number -n          Generate a set number of problems (default 1)\n"
  );
} else if (Bun.argv.includes("--list-topics") || Bun.argv.includes("-l")) {
  console.log(chalk.gray("List of available topics:"), topicValues);
  console.log();
} else {
  const { values } = parseArgs({
    args: Bun.argv,
    options: {
      topic: {
        type: "string",
      },
      t: {
        type: "string",
      },
      set: {
        type: "string",
      },
      s: {
        type: "string",
      },
      difficulty: {
        type: "string",
      },
      d: {
        type: "string",
      },
      number: {
        type: "string",
      },
      n: {
        type: "string",
      },
    },
    strict: true,
    allowPositionals: true,
  });

  const topic = values.topic || values.t;
  const set = values.set || values.s;
  const difficulty = values.difficulty || values.d;
  const number = values.number || values.n;
  const parsedNumber = number ? parseInt(number) : DEFAULT_NUMBER;

  const stopSpinner = spinner();

  generateProblems(parsedNumber, topic, set, difficulty).then((res) => {
    stopSpinner();

    if (res) {
      console.log(
        "Generated: ",
        res.map((problem) => problem.name)
      );
    }

    console.log(chalk.green("Done!"));
    console.log();
  });
}

async function traverseFolders(
  path: string,
  problems: Problem[],
  depth = 0
): Promise<Problem[]> {
  try {
    let dirCount = 0;

    for await (const entry of readdirSync(path)) {
      const subPath = `${path}/${entry}`;
      const subPathStats = statSync(subPath);
      if (subPathStats.isDirectory()) {
        dirCount++;

        await traverseFolders(subPath, problems, depth + 1);
      } else {
      }
    }
    if (dirCount === 0) {
      const name = path.split("/")[path.split("/").length - 1];
      problems.push({
        path,
        name,
        properties: problemProperties[name],
      });
    }
  } catch (error) {
    console.error(`Error reading directory: ${path}\n`);
    console.error(error);
  }
  return problems;
}

function countDirectories(dir: string) {
  const entries = readdirSync(dir, { withFileTypes: true });
  const directoryCount = entries.filter((entry) => entry.isDirectory()).length;
  return directoryCount;
}

async function generateProblems(
  number: number,
  topic?: string,
  set?: string,
  difficulty?: string
): Promise<Problem[] | null> {
  return await new Promise((resolve) => {
    setTimeout(async () => {
      try {
        mkdirSync(`${BASEDIR}../practice`);
      } catch (_error) {}

      const practiceCount = countDirectories(BASEDIR + "../practice");

      try {
        mkdirSync(`${BASEDIR}../practice/practice-${practiceCount + 1}`);
      } catch (_error) {}

      traverseFolders(BASEDIR + "../src/problems", []).then((res) => {
        const filteredProblems = res
          .filter((problem) => {
            if (topic) {
              return problem?.properties?.topics.includes(topic as Topic);
            } else {
              return true;
            }
          })
          .filter((problem) => {
            if (set) {
              return problem?.properties?.set.includes(set as ProblemSet);
            } else {
              return true;
            }
          })
          .filter((problem) => {
            if (difficulty) {
              return problem?.properties?.difficulty === difficulty;
            } else {
              return true;
            }
          });

        const problemIndexes = Array.from(
          Array(filteredProblems.length).keys()
        );

        const numProblemsToCopy =
          filteredProblems.length < number ? filteredProblems.length : number;

        let problemsToCopy: Problem[] = [];

        Array.from(Array(numProblemsToCopy).keys()).forEach(() => {
          const randomIndex = Math.floor(Math.random() * problemIndexes.length);
          problemsToCopy.push(filteredProblems[problemIndexes[randomIndex]]);
          problemIndexes.splice(randomIndex, 1);
        });

        problemsToCopy.forEach((problem) => {
          copyProblem(problem, practiceCount);
        });

        resolve(problemsToCopy);
      });
    }, 1000);
  });
}

function copyProblem(problem: Problem, practiceCount: number) {
  const sourcePath = `${problem.path}/${problem.name}.ts`;
  const destinationPath = `${BASEDIR}../practice/practice-${
    practiceCount + 1
  }/${problem.name}/${problem.name}.ts`;
  const testSourcePath = `${problem.path}/${problem.name}.test.ts`;
  const testDestinationPath = `${BASEDIR}../practice/practice-${
    practiceCount + 1
  }/${problem.name}/${problem.name}.test.ts`;
  try {
    mkdirSync(
      `${BASEDIR}../practice/practice-${practiceCount + 1}/${problem.name}`
    );
  } catch (_error) {}
  copyFileSync(sourcePath, destinationPath);
  copyFileSync(testSourcePath, testDestinationPath);
}

function spinner(): () => void {
  const frames = ["◐", "◓", "◑", "◒"];
  let frameIndex = 0;
  const interval = 100;
  let isTaskDone = false;

  const clearSpinner = () => {
    stdout.write(new TextEncoder().encode("\x1b[?25h\x1b[2K\r"));
  };

  stdout.write(new TextEncoder().encode("\x1b[?25l"));

  const timer = setInterval(() => {
    if (isTaskDone) {
      clearInterval(timer);
      clearSpinner();
      return;
    }

    stdout.write(
      new TextEncoder().encode(
        chalk.yellow(`\r${frames[frameIndex]} Generating problems...`)
      )
    );
    frameIndex = (frameIndex + 1) % frames.length;
  }, interval);

  process.on("SIGINT", () => {
    clearInterval(timer);
    clearSpinner();
    console.log(chalk.red("Program exited"));
    exit();
  });

  return () => {
    clearSpinner();
    clearInterval(timer);
    return;
  };
}
