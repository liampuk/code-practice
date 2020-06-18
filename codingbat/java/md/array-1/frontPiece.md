# frontPiece

Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

```
frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
```

**Solution:**

```java
public int[] frontPiece(int[] nums) {
  return nums.length < 2 ? nums : new int[]{nums[0], nums[1]};
}
```

> _[codingbat](http://codingbat.com/prob/p142455)_

> [< _back to readme_](FINDREPLACEREADME)