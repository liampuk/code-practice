# sum2

Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

```
sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
```

**Solution:**

```python
def sum2(nums):
  count = 0;
  i = 0;
  for x in nums:
    count += x;
    i += 1;
    if i >= 2:
      break;
  return count;
```

> _[codingbat](https://codingbat.com/prob/p192589)_

> [< _back to readme_](/README.md)