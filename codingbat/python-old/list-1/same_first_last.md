# same_first_last

Given an array of ints, return True if the array is length 1 or more, and the first element and the last element are equal.

```
same_first_last([1, 2, 3]) → False
same_first_last([1, 2, 3, 1]) → True
same_first_last([1, 2, 1]) → True
```

**Solution:**

```python
def same_first_last(nums):
  return len(nums) >= 1 and nums[0] == nums[len(nums)-1];
```

> _[codingbat](https://codingbat.com/prob/p179078)_