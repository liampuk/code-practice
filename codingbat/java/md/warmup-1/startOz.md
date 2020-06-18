# startOz

Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

```
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
```

**Solution:**

```java
public String startOz(String str) {
  String str2 = "";
  if(str.length()>0 && str.charAt(0) == 'o'){
    str2+="o";
  }
  if(str.length()>1 && str.charAt(1) == 'z'){
    str2+="z";
  }
  return str2;
}
```

> _[codingbat](http://codingbat.com/prob/p199720)_

> [< _back to readme_](FINDREPLACEREADME)