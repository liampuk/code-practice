# cat_dog

Return True if the string "cat" and "dog" appear the same number of times in the given string.

```
cat_dog('catdog') → True
cat_dog('catcat') → False
cat_dog('1cat1cadodog') → True
```

**Solution:**

```python
def cat_dog(str):
  dog = 0;
  cat = 0;
  while len(str) >= 3:
    if str[:3] == "cat":
      cat += 1;
      str = str[3:];
    elif str[:3] == "dog":
      dog += 1;
      str = str[3:];
    else:
      str = str[1:];
  return dog == cat;
```

> _[codingbat](https://codingbat.com/prob/p164876)_