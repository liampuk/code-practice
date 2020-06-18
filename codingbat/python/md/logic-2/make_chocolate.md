# make_chocolate

We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

```
make_chocolate(4, 1, 9) → 4
make_chocolate(4, 1, 10) → -1
make_chocolate(4, 1, 7) → 2
```

**Solution:**

```python
def make_chocolate(small, big, goal):
  big_used = (goal-(goal%5))/5 if (goal-(goal%5))/5 <= big else big;
  if goal-(big_used*5) <= small or goal - (big_used * 5) - small <= 0:
    return goal - big_used*5;
  return -1;
```

> _[codingbat](https://codingbat.com/prob/p190859)_

> [< _back to readme_](FINDREPLACEREADME)