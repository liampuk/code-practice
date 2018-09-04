# stringClean

Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

```
stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
```

**Solution:**

```java
public String stringClean(String str) {
  if(str.length() < 2) return str;
  if(str.charAt(1) == str.charAt(0)){
    return stringClean(str.substring(1));
  }
  return str.charAt(0)+stringClean(str.substring(1));
}
```

> _[codingbat](https://codingbat.com/prob/p104029)_