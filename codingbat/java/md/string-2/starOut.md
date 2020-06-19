# starOut

Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

```
starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
```

**Solution:**

```java
public String starOut(String str) {
  for(int i=0; i<str.length(); i++){
    if(str.charAt(i) == '*'){
      if(i < str.length()-1){
        if(str.charAt(i+1) == '*'){
          str = str.substring(0, i) + str.substring(i+1);
          i--;
        }else{
          if(i == 0){
            str = str.substring(2);
          }else{
            str = str.substring(0,i-1) + str.substring(i+2);
            i--;
          }
        }
      }else{
        str = str.substring(0, i-(str.length() > 1 ? 1 : 0));
      }
    }
  }
  return str;
}
```

> _[codingbat](https://codingbat.com/prob/p139564)_

> [< _back to readme_](/README.md)