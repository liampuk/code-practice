def end_other(a, b):
  a = a.lower();
  b = b.lower();
  if len(a) > len(b):
    if a[len(a)-len(b):] == b:
      return True;
  if b[len(b)-len(a):] == a:
    return True;
  return False;
