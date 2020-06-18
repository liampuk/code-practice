# first_two

Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

```
first_two('Hello') → 'He'
first_two('abcdefg') → 'ab'
first_two('ab') → 'ab'
```

**Solution:**

```python
def first_two(str):
  length = 2 if len(str) >= 2 else len(str);
  return str[:length];
```

> _[codingbat](https://codingbat.com/prob/p184816)_

> [< _back to readme_](FINDREPLACEREADME)