# maxMirror

We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

```
maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
```

**Solution:**

```java
public int maxMirror(int[] nums) {
  int max = 0;
  int curMax = 0;
  for(int i=0; i<nums.length; i++){
    for(int j=nums.length-1; j>= 0; j--){
      if(nums[i] == nums[j]){
        for(int z=0; i+z<nums.length && j-z>=0; z++){
          if(nums[i+z] == nums[j-z]){
            curMax++;
            max = curMax > max ? curMax : max;
          }else{
            break;
          }
        }
        curMax = 0;
      }
    }
  }
  return max;
}
```

> _[codingbat](https://codingbat.com/prob/p196409)_


> [< _back to readme_](/README.md)