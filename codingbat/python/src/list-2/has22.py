def has22(nums):
  last_two = False;
  i = 0;
  while i < len(nums):
    if nums[i] == 2:
      if last_two:
        return True;
      last_two = True;
    else:
      last_two = False;
    i += 1;
  return False;
