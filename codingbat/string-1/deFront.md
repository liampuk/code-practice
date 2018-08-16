# deFront

Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

```
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
```

**Solution:**

```java
public String deFront(String str) {    
  if(str.length() >=2 && str.charAt(1) != 'b'){
    str = str.charAt(0)+str.substring(2);
  }
  if(str.length() >= 1 && str.charAt(0) != 'a'){
    str = str.substring(1);
  }
  return str;
}
```

> _[codingbat](http://codingbat.com/prob/p110141)_