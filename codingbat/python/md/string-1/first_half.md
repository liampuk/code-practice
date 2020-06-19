# first_half

Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

```
first_half('WooHoo') → 'Woo'
first_half('HelloThere') → 'Hello'
first_half('abcdef') → 'abc'
```

**Solution:**

```python
def first_half(str):
  return str[:len(str)/2];
```

> _[codingbat](https://codingbat.com/prob/p107010)_

> [< _back to readme_](/README.md)