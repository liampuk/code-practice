# altPairs

Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

```
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
```

**Solution:**

```java
public String altPairs(String str) {
  String res = "";
  for(int i=0; i<str.length(); i++){
    res += str.charAt(i);
    if(i%2==1){
      i+=2;
    }
  }
  return res;
}
```

> _[codingbat](http://codingbat.com/prob/p121596)_

> [< _back to readme_](/README.md)