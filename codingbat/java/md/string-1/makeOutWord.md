# makeOutWord

Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

```
makeOutWord("&lt;&lt;&gt;&gt;", "Yay") → "&lt;&lt;Yay&gt;&gt;"
makeOutWord("&lt;&lt;&gt;&gt;", "WooHoo") → "&lt;&lt;WooHoo&gt;&gt;"
makeOutWord("[[]]", "word") → "[[word]]"
```

**Solution:**

```java
public String makeOutWord(String out, String word) {
  return out.substring(0,2)+word+out.substring(2);
}
```

> _[codingbat](http://codingbat.com/prob/p184030)_

> [< _back to readme_](FINDREPLACEREADME)