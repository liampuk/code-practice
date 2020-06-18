# copyEvens

Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.

```
copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
```

**Solution:**

```java
public int[] copyEvens(int[] nums, int count) {
  int[] arr = new int[count];
  int arrIndex = 0;
  for(int i=0; i<nums.length && arrIndex<count; i++){
    if(nums[i]%2 == 0){
      arr[arrIndex] = nums[i];
      arrIndex++;
    }
  }
  return arr;
}
```

> _[codingbat](https://codingbat.com/prob/p134174)_

> [< _back to readme_](FINDREPLACEREADME)