# diff21

Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

```
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
```

**Solution:**

```java
public int diff21(int n) {
  if(n <= 21){
    return Math.abs(21-n);
  }else{
    return Math.abs((21-n)*2);
  }
}
```

> _[codingbat](http://codingbat.com/prob/p116624)_

> [< _back to readme_](/README.md)