# twoAsOne

Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

```
twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
```

**Solution:**

```java
public boolean twoAsOne(int a, int b, int c) {
  return a + b == c ? true : a + c == b ? true : c + b == a ? true : false;
}
```

> _[codingbat](http://codingbat.com/prob/p113261)_