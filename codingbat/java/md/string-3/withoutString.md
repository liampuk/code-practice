# withoutString

Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

```
withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
```

**Solution:**

```java
public String withoutString(String base, String remove) {
  for(int i=0; i<base.length()-remove.length()+1; i++){
    if(base.substring(i, i+remove.length()).toLowerCase().equals(remove.toLowerCase())){
      base = base.substring(0,i)+base.substring(i+remove.length());
      i-= i >= remove.length() ? remove.length() : 1;
    }
  }
  return base;
}
```

> _[codingbat](https://codingbat.com/prob/p192570)_

> [< _back to readme_](/README.md)