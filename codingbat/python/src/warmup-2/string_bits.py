def string_bits(str):
  s = ""
  i = 0
  while i < len(str):
    if i%2 == 0:
      s+=str[i:i+1];
    i+=1;
  return s;
