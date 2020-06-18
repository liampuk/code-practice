# addStar

Given a list of strings, return a list where each string has "*" added at its end.

```
addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
```

**Solution:**

```java
public List<String> addStar(List<String> strings) {
  strings.replaceAll(s -> s+"*");
  return strings;
}
```

> _[codingbat](https://codingbat.com/prob/p170181)_

> [< _back to readme_](FINDREPLACEREADME)