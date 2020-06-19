# pairs

Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.

```
pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
```

**Solution:**

```java
public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for(int i=0; i<strings.length; i++){
    map.put(String.valueOf(strings[i].charAt(0)), String.valueOf(strings[i].charAt(strings[i].length()-1)));
  }
  return map;
}
```

> _[codingbat](https://codingbat.com/prob/p126332)_

> [< _back to readme_](/README.md)