# sum67

Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

```
sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
```

**Solution:**

```python
def sum67(nums):
  sum = 0;
  no_skip = True;
  i = 0;
  while i < len(nums):
    if no_skip and nums[i] != 6:
      sum += nums[i];
    if nums[i] == 6:
      no_skip = False;
    if nums[i] == 7:
      no_skip = True;
    i += 1;
  return sum;
```

> _[codingbat](https://codingbat.com/prob/p108886)_

> [< _back to readme_](/README.md)