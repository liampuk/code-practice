def round_sum(a, b, c):
  return round_sum_helper(a) + round_sum_helper(b) + round_sum_helper(c);
def round_sum_helper(n):
  if n%10 >= 5:
    return n + 10 - (n%10);
  return n - (n%10);
