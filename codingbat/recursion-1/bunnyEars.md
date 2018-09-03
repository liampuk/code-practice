# bunnyEars

We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

```
bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
```

**Solution:**

```java
public int bunnyEars(int bunnies) {
  return bunnies == 0 ? 0 : 2 + bunnyEars(bunnies-1);
}
```

> _[codingbat](https://codingbat.com/prob/p183649)_