def make_bricks(small, big, goal):
  if goal/5 <= big:
    return goal%5 <= small;
  goal = goal-(5*big);
  return goal <= small;
