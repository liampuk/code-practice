# frontTimes

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

```
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
```

**Solution:**

```java
public String frontTimes(String str, int n) {
  String res = "";
  int len = str.length() >= 3 ? 3 : str.length();
  for(int i=0; i<n; i++){
    res+=str.substring(0, len);
  }
  return res;
}
```

> _[codingbat](http://codingbat.com/prob/p101475)_

> [< _back to readme_](/README.md)