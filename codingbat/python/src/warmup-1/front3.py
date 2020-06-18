def front3(str):
  charNum = 3 if len(str) >= 3 else len(str);
  return str[:charNum]+str[:charNum]+str[:charNum];
