# haveThree

Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

```
haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
```

**Solution:**

```java
public boolean haveThree(int[] nums) {
  int prevThree = -2;
  int count = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 3){
      count++;
      if(i == prevThree+1){
        return false;
      }
      prevThree = i;
    }
  }
  return count == 3;
}
```

> _[codingbat](https://codingbat.com/prob/p109783)_

> [< _back to readme_](/README.md)