# pos_neg

Given 2 int values, return True if one is negative and one is positive. Except if the parameter "negative" is True, then return True only if both are negative.

```
pos_neg(1, -1, False) → True
pos_neg(-1, 1, False) → True
pos_neg(-4, -5, True) → True
```

**Solution:**

```python
def pos_neg(a, b, negative):
  return (negative and a<0 and b<0) or (not negative and a<0 and b>0) or (not negative and a>0 and b<0);
```

> _[codingbat](https://codingbat.com/prob/p162058)_