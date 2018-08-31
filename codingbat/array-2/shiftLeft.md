# shiftLeft

Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

```
shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
```

**Solution:**

```java
public int[] shiftLeft(int[] nums) {
  if(nums.length == 0){
    return nums;
  }
  int startTemp = nums[0];
  for(int i=0; i<nums.length-1; i++){
    nums[i] = nums[i+1];
  }
  nums[nums.length-1] = startTemp;
  return nums;
}
```

> _[codingbat](https://codingbat.com/prob/p105031)_