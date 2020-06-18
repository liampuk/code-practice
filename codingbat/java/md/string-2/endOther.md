# endOther

Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

```
endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
```

**Solution:**

```java
public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  if(a.length() >= b.length()){
    return a.substring(a.length()-b.length()).equals(b);
  }
  if(b.length() > a.length()){
    return b.substring(b.length()-a.length()).equals(a);
  }
  return false;
}
```

> _[codingbat](http://codingbat.com/prob/p126880)_

> [< _back to readme_](FINDREPLACEREADME)