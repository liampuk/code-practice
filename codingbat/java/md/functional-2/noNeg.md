# noNeg

Given a list of integers, return a list of the integers, omitting any that are less than 0.

```
noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
```

**Solution:**

```java
public List<Integer> noNeg(List<Integer> nums) {
  nums.removeIf(n -> n<0);
  return nums;
}
```

> _[codingbat](https://codingbat.com/prob/p103456)_

> [< _back to readme_](/README.md)