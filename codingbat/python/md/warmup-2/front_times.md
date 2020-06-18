# front_times

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

```
front_times('Chocolate', 2) → 'ChoCho'
front_times('Chocolate', 3) → 'ChoChoCho'
front_times('Abc', 3) → 'AbcAbcAbc'
```

**Solution:**

```python
def front_times(str, n):
  length = 3 if len(str) >= 3 else len(str);
  s = "";
  while n > 0:
    s+=str[0:length];
    n-=1;
  return s;
```

> _[codingbat](https://codingbat.com/prob/p165097)_

> [< _back to readme_](FINDREPLACEREADME)