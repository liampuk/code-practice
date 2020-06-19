# close10

Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

```
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
```

**Solution:**

```java
public int close10(int a, int b) {
  int a2 = Math.abs(a-10);
  int b2 = Math.abs(b-10);
  if(a2 == b2){
    return 0;
  }
  return a2 < b2 ? a : b;
}
```

> _[codingbat](http://codingbat.com/prob/p172021)_

> [< _back to readme_](/README.md)