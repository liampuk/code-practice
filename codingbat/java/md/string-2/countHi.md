# countHi

Return the number of times that the string "hi" appears anywhere in the given string.

```
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
```

**Solution:**

```java
public int countHi(String str) {
  int count = 0;
  for(int i=0; i<str.length()-1; i++){
    if(str.substring(i,i+2).equals("hi")){
      count++;
    }
  }
  return count;
}
```

> _[codingbat](http://codingbat.com/prob/p147448)_

> [< _back to readme_](/README.md)