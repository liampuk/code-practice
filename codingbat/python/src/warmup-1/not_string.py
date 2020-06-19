def not_string(str):
  return "not "+str if len(str) < 3 or not str[:3] == "not" else str;
