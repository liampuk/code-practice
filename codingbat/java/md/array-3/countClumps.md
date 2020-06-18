# countClumps

Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

```
countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
```

**Solution:**

```java
public int countClumps(int[] nums) {
  if(nums.length == 0){
    return 0;
  }
  int clumps;
  if(nums.length >= 2 && nums[0] == nums[1]){
    clumps = 1;
  }else{
    clumps = 0;
  }
  for(int i=1; i<nums.length-1; i++){
    if(nums[i] != nums[i-1] && nums[i] == nums[i+1]){
      clumps++;
    }
  }
  return clumps;
}
```

> _[codingbat](https://codingbat.com/prob/p193817)_

> [< _back to readme_](FINDREPLACEREADME)