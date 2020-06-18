def xyz_there(str):
  noPeriod = True;
  while len(str) >= 3:
    if noPeriod and str[:3] == "xyz":
      return True;
    if str[:1] == ".":
      noPeriod = False;
    else:
      noPeriod = True;
    str = str[1:];
  return False;
