# oneTwo

Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

```
oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
```

**Solution:**

```java
public String oneTwo(String str) {
  String store = "";
  String s = "";
  for(int i=0; i<str.length() - str.length()%3; i++){
    if(i%3 == 0){
      s+= store;
      store = str.charAt(i)+"";
    }else{
      s += str.charAt(i)+"";
    }
  }
  return s+store;
}
```

> _[codingbat](https://codingbat.com/prob/p122943)_

> [< _back to readme_](FINDREPLACEREADME)