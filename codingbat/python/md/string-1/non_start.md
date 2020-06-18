# non_start

Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

```
non_start('Hello', 'There') → 'ellohere'
non_start('java', 'code') → 'avaode'
non_start('shotl', 'java') → 'hotlava'
```

**Solution:**

```python
def non_start(a, b):
  return a[1:]+b[1:];
```

> _[codingbat](https://codingbat.com/prob/p127703)_

> [< _back to readme_](FINDREPLACEREADME)