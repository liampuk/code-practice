# 🚀 Leetcode Problem Generator 🚀

Generate daily leetcode problems.

### Set up

To set up, [install bun](https://bun.sh/docs/installation) if you haven't already then install dependencies:

```bash
curl -fsSL https://bun.sh/install | bash
bun install
```

### Solve Problems

The generate script will generate a set of problems, which can be filtered by topic, set and difficulty. You can also specify the number of problems to generate.

To see a list of options for the problem generator, run:

```bash
bun run generate -h
```

To test your solutions, run:

```
bun run test
```

to test only one set of solutions (eg. `practice-1`), run:

```
bun test practice/practice-1 --watch
```
