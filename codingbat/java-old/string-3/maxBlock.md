# maxBlock

Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

```
maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
```

**Solution:**

```java
public int maxBlock(String str) {
  char currChar;
  int max = 0;
  for(int i=0; i<str.length(); i++){
    currChar = str.charAt(i);
    for(int j=i; j<str.length(); j++){
      if(str.charAt(j) == currChar){
        max = j-i+1 > max ? j-i+1 : max;
      }else{
        break;
      }
    }
  }
  return max;
}
```

> _[codingbat](https://codingbat.com/prob/p179479)_