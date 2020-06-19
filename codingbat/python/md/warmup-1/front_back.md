# front_back

Given a string, return a new string where the first and last chars have been exchanged.

```
front_back('code') → 'eodc'
front_back('a') → 'a'
front_back('ab') → 'ba'
```

**Solution:**

```python
def front_back(str):
  return str[len(str)-1]+str[1:len(str)-1]+str[0] if len(str)>1 else str;
```

> _[codingbat](https://codingbat.com/prob/p153599)_

> [< _back to readme_](/README.md)