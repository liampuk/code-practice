def squirrel_play(temp, is_summer):
  upper_bound = 100 if is_summer else 90;
  return temp >= 60 and temp <= upper_bound;
