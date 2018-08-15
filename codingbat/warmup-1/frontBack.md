# frontBack

Given a string, return a new string where the first and last chars have been exchanged.

```
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
```

**Solution:**

```java
public String frontBack(String str) {
  if(str.length() < 2){
    return str;
  }
  return str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
}
```