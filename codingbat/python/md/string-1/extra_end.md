# extra_end

Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

```
extra_end('Hello') → 'lololo'
extra_end('ab') → 'ababab'
extra_end('Hi') → 'HiHiHi'
```

**Solution:**

```python
def extra_end(str):
  return str[len(str)-2:]+str[len(str)-2:]+str[len(str)-2:];
```

> _[codingbat](https://codingbat.com/prob/p148853)_

> [< _back to readme_](/README.md)