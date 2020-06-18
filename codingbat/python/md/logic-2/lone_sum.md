# lone_sum

Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

```
lone_sum(1, 2, 3) → 6
lone_sum(3, 2, 3) → 2
lone_sum(3, 3, 3) → 0
```

**Solution:**

```python
def lone_sum(a, b, c):
  sum = a + b + c;
  if a == b: sum -= a*2;
  if b == c: sum -= b*2;
  if a == c: sum -= c*2;
  return sum if sum > 0 else 0;
```

> _[codingbat](https://codingbat.com/prob/p143951)_

> [< _back to readme_](FINDREPLACEREADME)