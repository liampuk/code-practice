# lower

Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

```
lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
```

**Solution:**

```java
public List<String> lower(List<String> strings) {
  strings.replaceAll(s -> s.toLowerCase());
  return strings;
}
```

> _[codingbat](https://codingbat.com/prob/p186894)_