# gHappy

We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

```
gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
```

**Solution:**

```java
public boolean gHappy(String str) {
  boolean happy = true;
  boolean skip = false;
  for(int i=0; i<str.length(); i++){
    if(str.charAt(i) == 'g'){
      if((i == str.length()-1 && !skip) || (i != str.length()-1 && str.charAt(i+1) != 'g') && !skip){
        happy = false;
      }else{
        happy = true;
        skip = true;
      }
    }else{
      skip = false;
    }
  }
  return happy;
}
```

> _[codingbat](https://codingbat.com/prob/p198664)_

> [< _back to readme_](FINDREPLACEREADME)