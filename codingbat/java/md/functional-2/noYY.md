# noYY

Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.

```
noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
```

**Solution:**

```java
public List<String> noYY(List<String> strings) {
  strings.replaceAll(s -> s+"y");
  strings.removeIf(s -> s.contains("yy"));
  return strings;
}
```

> _[codingbat](https://codingbat.com/prob/p115967)_

> [< _back to readme_](FINDREPLACEREADME)