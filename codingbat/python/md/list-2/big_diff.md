# big_diff

Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in min(v1, v2) and max(v1, v2) functions return the smaller or larger of two values.

```
big_diff([10, 3, 5, 6]) → 7
big_diff([7, 2, 10, 9]) → 8
big_diff([2, 10, 7, 2]) → 8
```

**Solution:**

```python
def big_diff(nums):
  min_val = nums[0];
  max_val = nums[0];
  i = 0;
  while i < len(nums):
    min_val = min(min_val, nums[i]);
    max_val = max(max_val, nums[i]);
    i += 1;
  return max_val-min_val;
```

> _[codingbat](https://codingbat.com/prob/p184853)_

> [< _back to readme_](/README.md)