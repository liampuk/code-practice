# double_char

Given a string, return a string where for every char in the original, there are two chars.

```
double_char('The') → 'TThhee'
double_char('AAbb') → 'AAAAbbbb'
double_char('Hi-There') → 'HHii--TThheerree'
```

**Solution:**

```python
def double_char(str):
  i = 0;
  while i < len(str):
    str = str[:i]+str[i:i+1]+str[i:];
    i += 2;
  return str;
```

> _[codingbat](https://codingbat.com/prob/p170842)_