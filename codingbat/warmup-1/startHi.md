# startHi


Given a string, return true if the string starts with "hi" and false otherwise.

```
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
```

**Solution:**

```java
public boolean startHi(String str) {
  return str.length() >= 2 && str.substring(0,2).equals("hi");
}
```

> _[codingbat](http://codingbat.com/prob/p191022)_