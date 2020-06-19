# sumNumbers

Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

```
sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
```

**Solution:**

```java
public int sumNumbers(String str) {
  int sIndex = 0;
  int sum = 0;
  for(int i=0; i<str.length(); i++){
    if(Character.isDigit(str.charAt(i))){
      sIndex = i;
      while(i < str.length() && Character.isDigit(str.charAt(i))){
        i++;
      }
      sum += Integer.parseInt(str.substring(sIndex, i));
    }
  }
  return sum;
}
```

> _[codingbat](https://codingbat.com/prob/p121193)_

> [< _back to readme_](/README.md)