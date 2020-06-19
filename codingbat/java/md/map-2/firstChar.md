# firstChar

Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.

```
firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
```

**Solution:**

```java
public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  String cc = "";
  for(int i=0; i<strings.length; i++){
    cc = String.valueOf(strings[i].charAt(0));
    if(map.get(cc) == null){
      map.put(cc , strings[i]);
    }else{
      map.put(cc, map.get(cc)+strings[i]);
    }
  }
  return map;
}
```

> _[codingbat](https://codingbat.com/prob/p168493)_

> [< _back to readme_](/README.md)