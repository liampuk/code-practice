# fizzString

Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)

```
fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
```

**Solution:**

```java
public String fizzString(String str) {
  String str2 = "";
  boolean check = false;
  if(str.charAt(0) == 'f'){
    str2+= "Fizz";
    check = true;;
  }
  if(str.charAt(str.length()-1) == 'b'){
    str2+= "Buzz";
    check = true;
  }
  return check ? str2 : str;
}
```

> _[codingbat](http://codingbat.com/prob/p137136)_

> [< _back to readme_](/README.md)