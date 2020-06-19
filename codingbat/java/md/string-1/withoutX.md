# withoutX

Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

```
withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
```

**Solution:**

```java
public String withoutX(String str) {
  if(str.length() > 0 && str.charAt(str.length()-1) == 'x'){
    str = str.substring(0,str.length()-1);
  }
  if(str.length() > 0 && str.charAt(0) == 'x'){
    str = str.substring(1);
  }
  return str;
}
```

> _[codingbat](http://codingbat.com/prob/p151940)_

> [< _back to readme_](/README.md)