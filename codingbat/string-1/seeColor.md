# seeColor

Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

```
seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
```

**Solution:**

```java
public String seeColor(String str) {
  return (str.length()>=3 && str.substring(0,3).equals("red")) ? "red" : (str.length()>=4 && str.substring(0,4).equals("blue")) ? "blue" : "";
}
```

> _[codingbat](http://codingbat.com/prob/p199216)_