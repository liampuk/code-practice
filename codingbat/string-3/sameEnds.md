# sameEnds

Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

```
sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
```

**Solution:**

```java
public String sameEnds(String string) {
  int count = 0;
  for(int i=0; i < string.length()/2+1; i++){
    if(string.substring(0,i).equals(string.substring(string.length()-i))){
      count = i;
    }
  }
  return string.substring(0,count);
}
```

> _[codingbat](https://codingbat.com/prob/p131516)_