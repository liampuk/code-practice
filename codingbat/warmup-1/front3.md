# front3

Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

```
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
```

**Solution:**

```java
public String front3(String str) {
  int len = str.length() >= 3 ? 3 : str.length();
  String str2 = str.substring(0,len);
  return str2+str2+str2;
}
```