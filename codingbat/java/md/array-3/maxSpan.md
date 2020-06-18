# maxSpan

Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

```
maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
```

**Solution:**

```java
public int maxSpan(int[] nums) {
  if(nums.length == 0){
    return 0;
  }
  int max = 1;
  int cSpan = 0;
  for(int i=0; i<nums.length; i++){
    for(int j=i; j<nums.length; j++){
      cSpan++;
      if(i != j && nums[j] == nums[i]){
        if(cSpan > max){
          max = cSpan;
        }
      }
    }
    cSpan = 0;
  }
  return max;
}
```

> _[codingbat](https://codingbat.com/prob/p189576)_

> [< _back to readme_](FINDREPLACEREADME)