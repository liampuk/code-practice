# moreY

Given a list of strings, return a list where each string has "y" added at its start and end.

```
moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
```

**Solution:**

```java
public List<String> moreY(List<String> strings) {
  strings.replaceAll(s -> "y"+s+"y");
  return strings;
}
```

> _[codingbat](https://codingbat.com/prob/p177528)_

> [< _back to readme_](/README.md)