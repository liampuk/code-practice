# nestParen

Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.

```
nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
```

**Solution:**

```java
public boolean nestParen(String str) {
  if(str.length() >= 2 && str.charAt(0) == '(' && str.charAt(str.length()-1) == ')'){
    return nestParen(str.substring(1, str.length()-1));
  }
  if(str.length() == 0) return true;
  return false;
}
```

> _[codingbat](https://codingbat.com/prob/p183174)_

> [< _back to readme_](/README.md)