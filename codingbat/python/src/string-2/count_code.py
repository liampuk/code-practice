def count_code(str):
  code = 0;
  while len(str) >= 3:
    if str[:2] == "co" and str[3:4] == "e":
      code += 1;
      str = str[4:];
    else:
      str = str[1:];
  return code;
