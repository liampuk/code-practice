# zeroFront

Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

```
zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
```

**Solution:**

```java
public int[] zeroFront(int[] nums) {
  int temp;
  boolean unSorted = true;
  while(unSorted){
    unSorted = false;
    for(int i=0; i<nums.length-1; i++){
    if(Math.abs(nums[i]) > Math.abs(nums[i+1])){
      temp = nums[i+1];
      nums[i+1] = nums[i];
      nums[i] = temp;
      unSorted = true;
    }
  }
  }
  
  return nums;
}
```

> _[codingbat](https://codingbat.com/prob/p193753)_