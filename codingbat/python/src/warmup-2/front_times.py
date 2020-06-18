def front_times(str, n):
  length = 3 if len(str) >= 3 else len(str);
  s = "";
  while n > 0:
    s+=str[0:length];
    n-=1;
  return s;
