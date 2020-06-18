def make_chocolate(small, big, goal):
  big_used = (goal-(goal%5))/5 if (goal-(goal%5))/5 <= big else big;
  if goal-(big_used*5) <= small or goal - (big_used * 5) - small <= 0:
    return goal - big_used*5;
  return -1;
