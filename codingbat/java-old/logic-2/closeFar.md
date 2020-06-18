# closeFar

Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

```
closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
```

**Solution:**

```java
public boolean closeFar(int a, int b, int c) {
  if((b <= a+1 && b >= a-1) && (c >= a+2 || c <= a-2) && (c >= b+2 || c <= b-2)){
    return true;
  }
  if((c <= a+1 && c >= a-1) && (b >= a+2 || b <= a-2) && (b >= c+2 || b <= c-2)){
    return true;
  }
  return false;
}
```

> _[codingbat](http://codingbat.com/prob/p138990)_