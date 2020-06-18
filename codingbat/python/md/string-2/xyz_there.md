# xyz_there

Return True if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

```
xyz_there('abcxyz') → True
xyz_there('abc.xyz') → False
xyz_there('xyz.abc') → True
```

**Solution:**

```python
def xyz_there(str):
  noPeriod = True;
  while len(str) >= 3:
    if noPeriod and str[:3] == "xyz":
      return True;
    if str[:1] == ".":
      noPeriod = False;
    else:
      noPeriod = True;
    str = str[1:];
  return False;
```

> _[codingbat](https://codingbat.com/prob/p149391)_

> [< _back to readme_](FINDREPLACEREADME)