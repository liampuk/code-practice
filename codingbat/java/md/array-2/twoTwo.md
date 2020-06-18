# twoTwo

Given an array of ints, return true if every 2 that appears in the array is next to another 2.

```
twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
```

**Solution:**

```java
public boolean twoTwo(int[] nums) {
  boolean check = true;
  int lastValue = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 2){
      if(lastValue != 2){
        check = false;
      }else{
        check = true;
      }
    }
    lastValue = nums[i];
  }
  return check;
}
```

> _[codingbat](https://codingbat.com/prob/p102145)_

> [< _back to readme_](FINDREPLACEREADME)