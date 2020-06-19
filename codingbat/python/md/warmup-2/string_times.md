# string_times

Given a string and a non-negative int n, return a larger string that is n copies of the original string.

```
string_times('Hi', 2) → 'HiHi'
string_times('Hi', 3) → 'HiHiHi'
string_times('Hi', 1) → 'Hi'
```

**Solution:**

```python
def string_times(str, n):
  s = "";
  i = 0
  while n>0:
    s+=str
    n-=1;
  return s;
```

> _[codingbat](https://codingbat.com/prob/p193507)_

> [< _back to readme_](/README.md)