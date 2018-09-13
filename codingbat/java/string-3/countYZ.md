# countYZ

Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

```
countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
```

**Solution:**

```java
public int countYZ(String str) {
  int count = 0;
  for(int i = 0; i<str.length(); i++){
    if((str.toLowerCase().charAt(i) == 'z' || str.toLowerCase().charAt(i) == 'y') && (i == str.length()-1 || !Character.isLetter(str.charAt(i+1)))){
      count++;
    }
  }
  return count;
}
```

> _[codingbat](https://codingbat.com/prob/p199171)_