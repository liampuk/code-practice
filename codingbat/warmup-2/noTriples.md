# noTriples

Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

```
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
```

**Solution:**

```java
public boolean noTriples(int[] nums) {
  int trippleCount = 1;
  for(int i = 1; i<nums.length; i++){
    if(nums[i] == nums[i-1]){
      trippleCount++;
    }else{
      trippleCount = 1;
    }
    if(trippleCount == 3){
      return false;
    }
  }
  return true;
}
```