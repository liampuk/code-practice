# mixString

Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

```
mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
```

**Solution:**

```java
public String mixString(String a, String b) {
  String str = "";
  while(a.length() > 0 && b.length() > 0){
    str+=a.charAt(0);
    str+=b.charAt(0);
    a = a.substring(1);
    b = b.substring(1);
  }
  return str+a+b;
}
```

> _[codingbat](https://codingbat.com/prob/p125185)_

> [< _back to readme_](/README.md)