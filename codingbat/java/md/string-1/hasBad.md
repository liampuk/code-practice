# hasBad

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

```
hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
```

**Solution:**

```java
public boolean hasBad(String str) {
  if(str.length() >= 4){
    return str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad");
  }
  return str.length() >= 3 ? str.substring(0,3).equals("bad") : false;
}
```

> _[codingbat](http://codingbat.com/prob/p139075)_

> [< _back to readme_](FINDREPLACEREADME)