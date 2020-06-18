def caught_speeding(speed, is_birthday):
  mod = 5 if is_birthday else 0;
  if speed <= 60+mod:
    return 0;
  if speed <= 80+mod:
    return 1;
  return 2;
