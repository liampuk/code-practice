# bunnyEars2

We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

```
bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
```

**Solution:**

```java
public int bunnyEars2(int bunnies) {
  return bunnies == 0 ? 0 : bunnies%2 == 0 ? 3 + bunnyEars2(bunnies-1) : 2 + bunnyEars2(bunnies-1);
}
```

> _[codingbat](https://codingbat.com/prob/p107330)_

> [< _back to readme_](FINDREPLACEREADME)