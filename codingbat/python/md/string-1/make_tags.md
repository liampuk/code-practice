# make_tags

The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

```
make_tags('i', 'Yay') → '&lt;i&gt;Yay&lt;/i&gt;'
make_tags('i', 'Hello') → '&lt;i&gt;Hello&lt;/i&gt;'
make_tags('cite', 'Yay') → '&lt;cite&gt;Yay&lt;/cite&gt;'
```

**Solution:**

```python
def make_tags(tag, word):
  return "<"+tag+">"+word+"</"+tag+">";
```

> _[codingbat](https://codingbat.com/prob/p132290)_

> [< _back to readme_](/README.md)