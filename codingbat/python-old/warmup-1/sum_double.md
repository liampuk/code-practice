# sum_double

Given two int values, return their sum. Unless the two values are the same, then return double their sum.

```
sum_double(1, 2) → 3
sum_double(3, 2) → 5
sum_double(2, 2) → 8
```

**Solution:**

```python
def sum_double(a, b):
  return a+b if not a == b else a+a+b+b;
```

> _[codingbat](https://codingbat.com/prob/p141905)_