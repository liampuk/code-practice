# shareDigit

Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

```
shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
```

**Solution:**

```java
public boolean shareDigit(int a, int b) {
  return Math.floor(a/10) == Math.floor(b/10) || a%10 == b%10 || Math.floor(a/10) == b%10 || Math.floor(b/10) == a%10;
}
```

> _[codingbat](http://codingbat.com/prob/p153748)_