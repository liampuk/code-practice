# doubleChar

Given a string, return a string where for every char in the original, there are two chars.

```
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
```

**Solution:**

```java
public String doubleChar(String str) {
  String str2 = "";
  for(int i=0; i<str.length(); i++){
    str2+=str.charAt(i);
    str2+=str.charAt(i);
  }
  return str2;
}
```

> _[codingbat](http://codingbat.com/prob/p165312)_

> [< _back to readme_](FINDREPLACEREADME)