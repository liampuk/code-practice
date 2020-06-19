# front3

Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

```
front3('Java') → 'JavJavJav'
front3('Chocolate') → 'ChoChoCho'
front3('abc') → 'abcabcabc'
```

**Solution:**

```python
def front3(str):
  charNum = 3 if len(str) >= 3 else len(str);
  return str[:charNum]+str[:charNum]+str[:charNum];
```

> _[codingbat](https://codingbat.com/prob/p147920)_

> [< _back to readme_](/README.md)