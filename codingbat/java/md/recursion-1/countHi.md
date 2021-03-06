# countHi

Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

```
countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
```

**Solution:**

```java
public int countHi(String str) {
  if(str.length() < 2) return 0;
  if(str.substring(0,2).equals("hi")){
    return 1+countHi(str.substring(2));
  }
  return countHi(str.substring(1));
}
```

> _[codingbat](https://codingbat.com/prob/p184029)_

> [< _back to readme_](/README.md)