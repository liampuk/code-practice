# theEnd

Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

```
theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
```

**Solution:**

```java
public String theEnd(String str, boolean front) {
  return "" + (front ? str.charAt(0) : str.charAt(str.length()-1));
}
```

> _[codingbat](http://codingbat.com/prob/p162477)_

> [< _back to readme_](/README.md)