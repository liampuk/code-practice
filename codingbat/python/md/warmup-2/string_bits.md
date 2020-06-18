# string_bits

Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

```
string_bits('Hello') → 'Hlo'
string_bits('Hi') → 'H'
string_bits('Heeololeo') → 'Hello'
```

**Solution:**

```python
def string_bits(str):
  s = ""
  i = 0
  while i < len(str):
    if i%2 == 0:
      s+=str[i:i+1];
    i+=1;
  return s;
```

> _[codingbat](https://codingbat.com/prob/p113152)_

> [< _back to readme_](FINDREPLACEREADME)