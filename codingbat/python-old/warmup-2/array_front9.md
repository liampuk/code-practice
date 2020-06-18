# array_front9

Given an array of ints, return True if one of the first 4 elements in the array is a 9. The array length may be less than 4.

```
array_front9([1, 2, 9, 3, 4]) → True
array_front9([1, 2, 3, 4, 9]) → False
array_front9([1, 2, 3, 4, 5]) → False
```

**Solution:**

```python
def array_front9(nums):
  check = 3 if len(nums) >= 4 else len(nums)-1;
  count = 0;
  while check >= 0:
    if nums[check] == 9:
      return True;
    check -= 1;
  return False;
```

> _[codingbat](https://codingbat.com/prob/p110166)_