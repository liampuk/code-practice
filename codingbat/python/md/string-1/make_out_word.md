# make_out_word

Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".

```
make_out_word('&lt;&lt;&gt;&gt;', 'Yay') → '&lt;&lt;Yay&gt;&gt;'
make_out_word('&lt;&lt;&gt;&gt;', 'WooHoo') → '&lt;&lt;WooHoo&gt;&gt;'
make_out_word('[[]]', 'word') → '[[word]]'
```

**Solution:**

```python
def make_out_word(out, word):
  return out[0:2]+word+out[2:];
```

> _[codingbat](https://codingbat.com/prob/p129981)_

> [< _back to readme_](FINDREPLACEREADME)