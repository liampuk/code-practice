# string_match

Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

```
string_match('xxcaazz', 'xxbaaz') → 3
string_match('abc', 'abc') → 2
string_match('abc', 'axc') → 0
```

**Solution:**

```python
def string_match(a, b):
  small = len(a) if len(a) < len(b) else len(b);
  count = 0;
  i = 0;
  while i < small-1:
    if a[i:i+2] == b[i:i+2]:
      count += 1;
    i += 1;
  return count;
```

> _[codingbat](https://codingbat.com/prob/p182414)_

> [< _back to readme_](/README.md)