# hasOne

Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

```
hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
```

**Solution:**

```java
public boolean hasOne(int n) {
  if(n<10) return n%10 == 1;
  return n%10 == 1 ? true : hasOne(n/10);
}
```