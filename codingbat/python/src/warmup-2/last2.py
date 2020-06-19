def last2(str):
  count = 0;
  if len(str) >=3:
    i = 0;
    while i < len(str)-2:
      if str[i:i+2] == str[len(str)-2:]:
        count+=1;
      i+=1;
  return count;
