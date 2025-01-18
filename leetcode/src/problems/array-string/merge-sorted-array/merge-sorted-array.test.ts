import { expect, test } from "bun:test";
import { merge } from "./merge-sorted-array.ts";

test("temp test", () => {
  const nums1: number[] = [];
  const m = 2;

  merge(nums1, m, [], 0);

  expect(nums1).toEqual([2]);
});
