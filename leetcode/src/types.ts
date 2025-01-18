export const topicValues = [
  "array",
  "two-pointers",
  "sorting",
  "string",
] as const;

export type Topic = (typeof topicValues)[number];
export type ProblemSet = "ti150";
export type Difficulty = "easy";

export type Properties = {
  topics: Topic[];
  set: ProblemSet[];
  difficulty: Difficulty;
};

export type Problem = {
  name: string;
  path: string;
  properties?: Properties;
};
