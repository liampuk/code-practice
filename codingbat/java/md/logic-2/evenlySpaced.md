# evenlySpaced

Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

```
evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
```

**Solution:**

```java
public boolean evenlySpaced(int a, int b, int c) {
  return a-b == b-c || a-c == c-b || b-a == a-c;
}
```

> _[codingbat](http://codingbat.com/prob/p198700)_

> [< _back to readme_](/README.md)