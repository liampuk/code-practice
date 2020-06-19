# blackjack

Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

```
blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
```

**Solution:**

```java
public int blackjack(int a, int b) {
  return a > 21 && b > 21 ? 0 : a > b && a <= 21 ? a : b <= 21 ? b : a;
}
```

> _[codingbat](http://codingbat.com/prob/p117019)_

> [< _back to readme_](/README.md)