# notReplace

Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

```
notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
```

**Solution:**

```java
public String notReplace(String str) {
  for(int i=0; i<str.length()-1; i++){
    if(str.substring(i, i+2).equals("is")){
      if(i-1 < 0 || !Character.isLetter(str.charAt(i-1))){
        if(i+3 > str.length() || !Character.isLetter(str.charAt(i+2))){
          str = fix(str,i);
        }
      }
    }
  }
  return str;
}
public String fix(String str, int i){
  return str = str.substring(0,i+2)+" not"+str.substring(i+2);
}
```

> _[codingbat](https://codingbat.com/prob/p154137)_