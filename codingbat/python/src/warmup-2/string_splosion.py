def string_splosion(str):
  s = "";
  i = 1;
  while i <= len(str):
    s+=str[0:i];
    i+=1;
  return s;
