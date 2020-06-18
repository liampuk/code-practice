# arrayCount9

Given an array of ints, return the number of 9's in the array.

```
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
```

**Solution:**

```java
public int arrayCount9(int[] nums) {
  int count = 0;
  for(int i=0; i<nums.length;i++){
    if(nums[i]==9){
      count++;
    }
  }
  return count;
}
```

> _[codingbat](http://codingbat.com/prob/p184031)_

> [< _back to readme_](FINDREPLACEREADME)