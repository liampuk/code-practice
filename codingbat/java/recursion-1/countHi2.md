# countHi2

Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.

```
countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
```

**Solution:**

```java
public int countHi2(String str) {
  if(str.length() < 2) return 0;
  if(str.length() >= 3 && str.substring(0,3).equals("xhi")){
    return countHi2(str.substring(3));
  }
  if(str.substring(0,2).equals("hi")){
    return 1+countHi2(str.substring(2));
  }
  return countHi2(str.substring(1));
}
```

> _[codingbat](https://codingbat.com/prob/p143900)_