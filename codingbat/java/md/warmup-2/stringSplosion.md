# stringSplosion

Given a non-empty string like "Code" return a string like "CCoCodCode".

```
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
```

**Solution:**

```java
public String stringSplosion(String str) {
  String res = "";
  for(int i=0; i<str.length();i++){
    res+=str.substring(0, i);
  }
  return res+str;
}
```

> _[codingbat](http://codingbat.com/prob/p117334)_

> [< _back to readme_](/README.md)