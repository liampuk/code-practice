def lone_sum(a, b, c):
  sum = a + b + c;
  if a == b: sum -= a*2;
  if b == c: sum -= b*2;
  if a == c: sum -= c*2;
  return sum if sum > 0 else 0;
