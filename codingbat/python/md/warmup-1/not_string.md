# not_string

Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged.

```
not_string('candy') → 'not candy'
not_string('x') → 'not x'
not_string('not bad') → 'not bad'
```

**Solution:**

```python
def not_string(str):
  return "not "+str if len(str) < 3 or not str[:3] == "not" else str;
```

> _[codingbat](https://codingbat.com/prob/p189441)_

> [< _back to readme_](FINDREPLACEREADME)