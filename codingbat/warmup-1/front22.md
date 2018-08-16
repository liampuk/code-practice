# front22

Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

```
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
```

**Solution:**

```java
public String front22(String str) {
  int len = str.length() >= 2 ? 2 : str.length();
  String str2 = str.substring(0,len);
  return str2+str+str2;
}
```

> _[codingbat](http://codingbat.com/prob/p183592)_