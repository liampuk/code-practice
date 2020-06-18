# atFirst

Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

```
atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
```

**Solution:**

```java
public String atFirst(String str) {
  return str.length() >= 2 ? str.substring(0,2) : str.length() == 1 ? str.substring(0,1)+"@" : "@@";
}
```

> _[codingbat](http://codingbat.com/prob/p139076)_

> [< _back to readme_](FINDREPLACEREADME)