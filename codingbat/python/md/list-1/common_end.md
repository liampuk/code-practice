# common_end

Given 2 arrays of ints, a and b, return True if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

```
common_end([1, 2, 3], [7, 3]) → True
common_end([1, 2, 3], [7, 3, 2]) → False
common_end([1, 2, 3], [1, 3]) → True
```

**Solution:**

```python
def common_end(a, b):
  return a[0] == b[0] or a[len(a)-1] == b[len(b)-1];
```

> _[codingbat](https://codingbat.com/prob/p147755)_

> [< _back to readme_](/README.md)