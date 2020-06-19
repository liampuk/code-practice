# prefixAgain

Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

```
prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
```

**Solution:**

```java
public boolean prefixAgain(String str, int n) {
  for(int i=1;i<str.length()-n+1;i++){
    if(str.substring(i,i+n).equals(str.substring(0,n))){
      return true;
    }
  }
  return false;
}
```

> _[codingbat](https://codingbat.com/prob/p136417)_

> [< _back to readme_](/README.md)