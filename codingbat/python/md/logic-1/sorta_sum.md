# sorta_sum

Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.

```
sorta_sum(3, 4) → 7
sorta_sum(9, 4) → 20
sorta_sum(10, 11) → 21
```

**Solution:**

```python
def sorta_sum(a, b):
  return a+b if a+b < 10 or a+b > 20 else 20;
```

> _[codingbat](https://codingbat.com/prob/p116620)_

> [< _back to readme_](/README.md)