# diff21

Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

```
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
```

**Solution:**

```python
def diff21(n):
  return abs(n-21)*2 if n > 21 else abs(21-n); 
```

> _[codingbat](https://codingbat.com/prob/p197466)_