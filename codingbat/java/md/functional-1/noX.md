# noX

Given a list of strings, return a list where each string has all its "x" removed.

```
noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
```

**Solution:**

```java
public List<String> noX(List<String> strings) {
  strings.replaceAll(s -> removeX(s));
  return strings;
}
public String removeX(String s){
  String sb = "";
  for(int i=0; i<s.length(); i++){
    if(s.charAt(i) != 'x'){
      sb+=String.valueOf(s.charAt(i));
    }
  }
  return sb;
}
```

> _[codingbat](https://codingbat.com/prob/p105967)_

> [< _back to readme_](/README.md)