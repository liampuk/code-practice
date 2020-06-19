# noZ

Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)

```
noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
```

**Solution:**

```java
public List<String> noZ(List<String> strings) {
  strings.removeIf(s -> containsZ(s));
  return strings;
}
public boolean containsZ(String s){
  for(int i=0; i<s.length(); i++){
    if(s.charAt(i) == 'z'){
      return true;
    }
  }
  return false;
}
```

> _[codingbat](https://codingbat.com/prob/p105671)_

> [< _back to readme_](/README.md)