# stringE

Return true if the given string contains between 1 and 3 'e' chars.

```
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
```

**Solution:**

```java
public boolean stringE(String str) {
  int c = 0;
  for(int i=0; i<str.length(); i++){
    if(str.charAt(i) == ('e')){
      c++;
    }
  }
  return c >= 1 && c <= 3;
}
```

> _[codingbat](http://codingbat.com/prob/p173784)_

> [< _back to readme_](FINDREPLACEREADME)