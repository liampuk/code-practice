# repeatSeparator

Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

```
repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
```

**Solution:**

```java
public String repeatSeparator(String word, String sep, int count) {
  String str2 = "";
  for(int i=0;i<count;i++){
    str2 += word+sep;
  }
  return str2.substring(0,str2.length()-sep.length());
}
```

> _[codingbat](https://codingbat.com/prob/p109637)_

> [< _back to readme_](/README.md)