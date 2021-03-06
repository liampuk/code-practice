# evenOdd

Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

```
evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
```

**Solution:**

```java
public int[] evenOdd(int[] nums) {
  int temp;
  boolean notSorted = true;
  while(notSorted){
    notSorted = false;
    for(int i=0; i<nums.length-1; i++){
      if(nums[i]%2 == 1 && nums[i+1]%2 == 0){
        temp = nums[i+1];
        nums[i+1] = nums[i];
        nums[i] = temp;
        notSorted = true;
      }
    }
  }
  return nums;
}
```

> _[codingbat](https://codingbat.com/prob/p105771)_

> [< _back to readme_](/README.md)