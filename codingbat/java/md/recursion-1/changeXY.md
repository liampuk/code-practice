# changeXY

Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

```
changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
```

**Solution:**

```java
public String changeXY(String str) {
  if(str.length() == 0) return "";
  if(str.charAt(0) == 'x'){
    return 'y'+changeXY(str.substring(1));
  }
  return str.charAt(0)+changeXY(str.substring(1));
}
```

> _[codingbat](https://codingbat.com/prob/p101372)_

> [< _back to readme_](/README.md)