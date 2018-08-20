# getSandwich

A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

```
getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
```

**Solution:**

```java
public String getSandwich(String str) {
  int firstBread = -1;
  int secondBread = -1;
  for(int i=0; i<str.length()-4; i++){
    if(str.substring(i,i+5).equals("bread")){
      if(firstBread >= 0){
        secondBread = i;
      }else{
        firstBread = i+5;
      }
    }
  }
  if(firstBread >= 0 && secondBread >= 0){
    return str.substring(firstBread, secondBread);
  }
  return "";
}
```

> _[codingbat](https://codingbat.com/prob/p129952)_