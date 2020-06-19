# scoresClump

Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.

```
scoresClump([3, 4, 5]) → true
scoresClump([3, 4, 6]) → false
scoresClump([1, 3, 5, 5]) → true
```

**Solution:**

```java
public boolean scoresClump(int[] scores) {
  for(int i=0; i<scores.length-2; i++){
    if(Math.abs(scores[i] - scores[i+1]) <=2 && Math.abs(scores[i] - scores[i+2]) <= 2){
      return true;
    }
  }
  return false;
}
```

> _[codingbat](https://codingbat.com/prob/p194530)_

> [< _back to readme_](/README.md)