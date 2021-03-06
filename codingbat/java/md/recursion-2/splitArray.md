# splitArray

Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)

```
splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true
```

**Solution:**

```java
public boolean splitArray(int[] nums) {
  return sum(0, nums, 0, 0);
}
public boolean sum(int start, int[] nums, int group1, int group2) {
  if(start >= nums.length) return group1 == group2;
  if(sum(start+1, nums, group1+nums[start], group2)){
    return true;
  }
  return sum(start+1, nums, group1, group2+nums[start]);
}
```

> _[codingbat](https://codingbat.com/prob/p185204)_

> [< _back to readme_](/README.md)