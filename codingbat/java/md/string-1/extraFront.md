# extraFront

Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.

```
extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
```

**Solution:**

```java
public String extraFront(String str) {
  String newStr = "";
  if(str.length()>=2){
    newStr = str.substring(0,2);
  }else{
    newStr = str;
  }
  return newStr+newStr+newStr;
}
```

> _[codingbat](http://codingbat.com/prob/p172063)_

> [< _back to readme_](FINDREPLACEREADME)