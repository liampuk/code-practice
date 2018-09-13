# equalIsNot

Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

```
equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
```

**Solution:**

```java
public boolean equalIsNot(String str) {
  int isCount = 0;
  int notCount = 0;
  for(int i=0; i<str.length(); i++){
    if(str.length()>=i+3 && str.substring(i,i+3).equals("not")){
      notCount++;
    }
    if(str.length()>=i+2 && str.substring(i,i+2).equals("is")){
      isCount++;
    }
  }
  return isCount == notCount;
}
```

> _[codingbat](https://codingbat.com/prob/p141736)_