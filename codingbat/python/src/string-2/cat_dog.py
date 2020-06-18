def cat_dog(str):
  dog = 0;
  cat = 0;
  while len(str) >= 3:
    if str[:3] == "cat":
      cat += 1;
      str = str[3:];
    elif str[:3] == "dog":
      dog += 1;
      str = str[3:];
    else:
      str = str[1:];
  return dog == cat;
