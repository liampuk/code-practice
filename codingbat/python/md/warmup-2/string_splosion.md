# string_splosion

Given a non-empty string like "Code" return a string like "CCoCodCode".

```
string_splosion('Code') → 'CCoCodCode'
string_splosion('abc') → 'aababc'
string_splosion('ab') → 'aab'
```

**Solution:**

```python
def string_splosion(str):
  s = "";
  i = 1;
  while i <= len(str):
    s+=str[0:i];
    i+=1;
  return s;
```

> _[codingbat](https://codingbat.com/prob/p118366)_

> [< _back to readme_](/README.md)