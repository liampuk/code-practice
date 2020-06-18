# stringX

Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

```
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
```

**Solution:**

```java
public String stringX(String str) {
  for(int i=1; i<str.length()-1; i++){
    if(str.charAt(i) == 'x'){
      str = str.substring(0,i) + str.substring(i+1);
      i--;
    }
  }
  return str;
}
```

> _[codingbat](http://codingbat.com/prob/p171260)_

> [< _back to readme_](FINDREPLACEREADME)