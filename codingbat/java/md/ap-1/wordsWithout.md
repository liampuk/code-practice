# wordsWithout

Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.

```
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
```

**Solution:**

```java
public String[] wordsWithout(String[] words, String target) {
  String arrBuilder = "";
  for(int i=0; i<words.length; i++){
    if(words[i] != target) arrBuilder+=","+words[i];
  }
  return arrBuilder.substring(1).split(",");
}
```

> _[codingbat](https://codingbat.com/prob/p121236)_

> [< _back to readme_](/README.md)