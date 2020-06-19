# firstTwo

Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

```
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
```

**Solution:**

```java
public String firstTwo(String str) {
  return str.length() >= 2 ? str.substring(0,2) : str;
}
```

> _[codingbat](http://codingbat.com/prob/p163411)_

> [< _back to readme_](/README.md)