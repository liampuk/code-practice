# more14

Given an array of ints, return true if the number of 1's is greater than the number of 4's

```
more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
```

**Solution:**

```java
public boolean more14(int[] nums) {
  int oneC = 0;
  int fourC = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 1){
      oneC++;
    }else if(nums[i] == 4){
      fourC++;
    }
  }
  return oneC > fourC;
}
```

> _[codingbat](https://codingbat.com/prob/p104627)_

> [< _back to readme_](FINDREPLACEREADME)