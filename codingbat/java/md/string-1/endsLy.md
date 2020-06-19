# endsLy

Given a string, return true if it ends in "ly".

```
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
```

**Solution:**

```java
public boolean endsLy(String str) {
  return str.length() >= 2 ? str.substring(str.length()-2).equals("ly") : false;
}
```

> _[codingbat](http://codingbat.com/prob/p103895)_

> [< _back to readme_](/README.md)