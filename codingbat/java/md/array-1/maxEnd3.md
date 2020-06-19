# maxEnd3

Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

```
maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
```

**Solution:**

```java
public int[] maxEnd3(int[] nums) {
  int big = 0;
  if(nums[0] > nums[nums.length-1]){
    big = nums[0];
  }else{
    big = nums[nums.length-1];
  }
  return new int[]{big, big, big};
}
```

> _[codingbat](http://codingbat.com/prob/p146256)_

> [< _back to readme_](/README.md)