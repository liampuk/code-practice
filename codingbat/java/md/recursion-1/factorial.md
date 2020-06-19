# factorial

Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

```
factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
```

**Solution:**

```java
public int factorial(int n) {
  return n == 0 ? 1 : n*factorial(n-1);
}
```

> _[codingbat](https://codingbat.com/prob/p154669)_

> [< _back to readme_](/README.md)