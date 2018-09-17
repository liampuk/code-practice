# has22

Given an array of ints, return True if the array contains a 2 next to a 2 somewhere.

```
has22([1, 2, 2]) → True
has22([1, 2, 1, 2]) → False
has22([2, 1, 2]) → False
```

**Solution:**

```python
def has22(nums):
  last_two = False;
  i = 0;
  while i < len(nums):
    if nums[i] == 2:
      if last_two:
        return True;
      last_two = True;
    else:
      last_two = False;
    i += 1;
  return False;
```

> _[codingbat](https://codingbat.com/prob/p119308)_