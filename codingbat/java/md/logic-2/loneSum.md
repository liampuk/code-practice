# loneSum

Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

```
loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
```

**Solution:**

```java
public int loneSum(int a, int b, int c) {
  if(a == b && b == c){
    return 0;
  }else{
    if(a == b){
      a = 0;
      b = 0;
    }
    if(b == c){
      b = 0;
      c = 0;
    }
    if(a == c){
      a = 0;
      c = 0;
    }
    return a+b+c;
  }
}
```

> _[codingbat](http://codingbat.com/prob/p148972)_

> [< _back to readme_](/README.md)