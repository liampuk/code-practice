# minCat

Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

```
minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
```

**Solution:**

```java
public String minCat(String a, String b) {
  if(a.length() > b.length()){
    a = a.substring(a.length()-b.length());
  }else{
    b = b.substring(b.length()-a.length());
  }
  return a+b;
}
```

> _[codingbat](http://codingbat.com/prob/p105745)_

> [< _back to readme_](FINDREPLACEREADME)