# triangle

We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.

```
triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
```

**Solution:**

```java
public int triangle(int rows) {
  return rows == 0 || rows == 1 ? rows : rows + triangle(rows-1);
} 
```

> _[codingbat](https://codingbat.com/prob/p194781)_

> [< _back to readme_](/README.md)