# everyNth

Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

```
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
```

**Solution:**

```java
public String everyNth(String str, int n) {
  String res = str.charAt(0)+"";
  for(int i=n; i<str.length(); i+=n){
    res+=str.charAt(i);
  }
  return res;
}
```

> _[codingbat](http://codingbat.com/prob/p196441)_