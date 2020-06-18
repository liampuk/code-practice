# count_code

Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

```
count_code('aaacodebbb') → 1
count_code('codexxcode') → 2
count_code('cozexxcope') → 2
```

**Solution:**

```python
def count_code(str):
  code = 0;
  while len(str) >= 3:
    if str[:2] == "co" and str[3:4] == "e":
      code += 1;
      str = str[4:];
    else:
      str = str[1:];
  return code;
```

> _[codingbat](https://codingbat.com/prob/p186048)_

> [< _back to readme_](FINDREPLACEREADME)