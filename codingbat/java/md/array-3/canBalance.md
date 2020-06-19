# canBalance

Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

```
canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
```

**Solution:**

```java
public boolean canBalance(int[] nums) {
  int sum = 0;
  int sumLeft = 0;
  for(int i=0; i<nums.length; i++){
    sum += nums[i];
  }
  for(int j=0; j<nums.length; j++){
    sum-=nums[j];
    sumLeft+=nums[j];
    if(sum == sumLeft){
      return true;
    }
  }
  return false;
}
```

> _[codingbat](https://codingbat.com/prob/p158767)_

> [< _back to readme_](/README.md)