# sameFirstLast

Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

```
sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
```

**Solution:**

```java
public boolean sameFirstLast(int[] nums) {
  if(nums.length >= 1){
    return nums[0] == nums[nums.length-1];
  }
  return false;
}
```

> _[codingbat](http://codingbat.com/prob/p118976)_

> [< _back to readme_](/README.md)