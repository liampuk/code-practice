# xyBalance

We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

```
xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
```

**Solution:**

```java
public boolean xyBalance(String str) {
  boolean last = true;
  for(int i=0; i<str.length(); i++){
    if(str.charAt(i) == 'x'){
      last = false;
    }else if(str.charAt(i) == 'y'){
      last = true;
    }
  }
  return last;
}
```

> _[codingbat](https://codingbat.com/prob/p134250)_

> [< _back to readme_](FINDREPLACEREADME)