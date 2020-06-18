# powerN

Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

```
powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
```

**Solution:**

```java
public int powerN(int base, int n) {
  return n == 0 ? 1 : base * powerN(base, n-1);
}
```

> _[codingbat](https://codingbat.com/prob/p158888)_

> [< _back to readme_](FINDREPLACEREADME)