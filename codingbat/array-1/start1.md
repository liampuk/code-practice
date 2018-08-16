# start1

Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

```
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
```

**Solution:**

```java
public int start1(int[] a, int[] b) {
  return a.length > 0 && a[0] == 1 ? b.length > 0 && b[0] == 1 ? 2 : 1 : b.length >0 && b[0] == 1 ? 1 : 0;
}
```

> _[codingbat](http://codingbat.com/prob/p109660)_