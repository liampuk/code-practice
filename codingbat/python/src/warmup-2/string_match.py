def string_match(a, b):
  small = len(a) if len(a) < len(b) else len(b);
  count = 0;
  i = 0;
  while i < small-1:
    if a[i:i+2] == b[i:i+2]:
      count += 1;
    i += 1;
  return count;
