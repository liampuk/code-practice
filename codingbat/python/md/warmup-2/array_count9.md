# array_count9

Given an array of ints, return the number of 9's in the array.

```
array_count9([1, 2, 9]) → 1
array_count9([1, 9, 9]) → 2
array_count9([1, 9, 9, 3, 9]) → 3
```

**Solution:**

```python
def array_count9(nums):
  count = 0;
  i = 0;
  while i < len(nums):
    if nums[i] == 9:
      count += 1;
    i += 1;
  return count;
```

> _[codingbat](https://codingbat.com/prob/p166170)_

> [< _back to readme_](/README.md)