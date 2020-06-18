# strDist

Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.

```
strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
```

**Solution:**

```java
public int strDist(String str, String sub) {
  if(str.length() < sub.length()) return 0;
  if(str.substring(0,sub.length()).equals(sub)){
    if(str.substring(str.length()-sub.length()).equals(sub)){
      return str.length();
    }
    return strDist(str.substring(0,str.length()-1), sub);
  }
  return strDist(str.substring(1), sub);
}
```

> _[codingbat](https://codingbat.com/prob/p195413)_

> [< _back to readme_](FINDREPLACEREADME)