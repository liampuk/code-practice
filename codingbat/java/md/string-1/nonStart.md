# nonStart

Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

```
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
```

**Solution:**

```java
public String nonStart(String a, String b) {
  return a.substring(1)+b.substring(1);
}
```

> _[codingbat](http://codingbat.com/prob/p143825)_

> [< _back to readme_](/README.md)