# squareUp

Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

```
squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
```

**Solution:**

```java
public int[] squareUp(int n) {
  int allocate;
  int[] arr = new int[n*n];
  for(int i=0; i<n*n; i++){
    allocate = (i%n+1)+(i/n)-n+1 > 0 ? 1 : 0;
    arr[i] = allocate == 1 ? n-(i%n) : 0;
  }
  return arr;
}
```

> _[codingbat](https://codingbat.com/prob/p155405)_

> [< _back to readme_](/README.md)