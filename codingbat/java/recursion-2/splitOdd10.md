# splitOdd10

Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)

```
splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true
```

**Solution:**

```java
public boolean splitOdd10(int[] nums) {
  return splitOdd10Helper(0, nums, 0, 0);
}
public boolean splitOdd10Helper(int start, int[] nums, int group1, int group2){
  if(start >= nums.length) return group1%10 == 0 && group2%2 == 1;
  if(splitOdd10Helper(start+1, nums, group1+nums[start], group2)){
    return true;
  }
  return splitOdd10Helper(start+1, nums, group1, group2+nums[start]);
}
```

> _[codingbat](https://codingbat.com/prob/p171660)_