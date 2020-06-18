# commonTwo

Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

```
commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
```

**Solution:**

```java
public int commonTwo(String[] a, String[] b) {
  int count = 0;
  int jStart = 0;
  String lastChecked = "";
  
  for(int i=0; i<a.length; i++){
    for(int j=jStart; j<b.length; j++){
      if(a[i].equals(b[j]) && !a[i].equals(lastChecked)){
        count++;
        jStart = j;
        lastChecked = a[i];
      }
    }
  }
  return count;
}
```

> _[codingbat](https://codingbat.com/prob/p100369)_

> [< _back to readme_](FINDREPLACEREADME)