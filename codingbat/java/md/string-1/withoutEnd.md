# withoutEnd

Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

```
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
```

**Solution:**

```java
public String withoutEnd(String str) {
  return str.substring(1,str.length()-1);
}
```

> _[codingbat](http://codingbat.com/prob/p130896)_

> [< _back to readme_](FINDREPLACEREADME)