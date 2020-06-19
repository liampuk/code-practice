# makeBricks

We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

```
makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
```

**Solution:**

```java
public boolean makeBricks(int small, int big, int goal) {
  int bigUsed = (int)goal/5;
  int rem = goal%5;
  if((bigUsed <= big && goal-(5*bigUsed) <= small) || (bigUsed > big && goal-(5*big) <= small)){
    return true;
  }
  return false;
}
```

> _[codingbat](http://codingbat.com/prob/p183562)_

> [< _back to readme_](/README.md)