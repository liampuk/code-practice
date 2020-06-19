# pre4

Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

```
pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
```

**Solution:**

```java
public int[] pre4(int[] nums) {
  int size = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 4){
      size = i;
      break;
    }
  }
  int[] arr = new int[size];
  for(int i=0; i<size; i++){
    arr[i] = nums[i];
  }
  return arr;
}
```

> _[codingbat](https://codingbat.com/prob/p100246)_

> [< _back to readme_](/README.md)