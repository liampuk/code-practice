# count_hi

Return the number of times that the string "hi" appears anywhere in the given string.

```
count_hi('abc hi ho') → 1
count_hi('ABChi hi') → 2
count_hi('hihi') → 2
```

**Solution:**

```python
def count_hi(str):
  count = 0;
  i = 0;
  while i < len(str):
    if str[i:i+2] == "hi":
      count += 1;
    i += 1;
  return count;
```

> _[codingbat](https://codingbat.com/prob/p167246)_