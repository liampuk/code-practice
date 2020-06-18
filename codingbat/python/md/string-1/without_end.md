# without_end

Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

```
without_end('Hello') → 'ell'
without_end('java') → 'av'
without_end('coding') → 'odin'
```

**Solution:**

```python
def without_end(str):
  return str[1:len(str)-1];
```

> _[codingbat](https://codingbat.com/prob/p138533)_

> [< _back to readme_](FINDREPLACEREADME)