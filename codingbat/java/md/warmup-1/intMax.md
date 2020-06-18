# intMax

Given three int values, a b c, return the largest.

```
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
```

**Solution:**

```java
public int intMax(int a, int b, int c) {
  if(a > b){
    return a > c ? a : c > b ? c : b;
  }
  return b > c ? b : c > a ? c : c;
}
```

> _[codingbat](http://codingbat.com/prob/p101887)_

> [< _back to readme_](FINDREPLACEREADME)