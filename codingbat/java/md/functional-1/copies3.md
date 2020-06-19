# copies3

Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.

```
copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
```

**Solution:**

```java
public List<String> copies3(List<String> strings) {
  strings.replaceAll(s -> s+s+s);
  return strings;
}
```

> _[codingbat](https://codingbat.com/prob/p181634)_

> [< _back to readme_](/README.md)