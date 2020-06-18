def double_char(str):
  i = 0;
  while i < len(str):
    str = str[:i]+str[i:i+1]+str[i:];
    i += 2;
  return str;
