def array123(nums):
  i = 0;
  while i < len(nums)-2:
    if nums[i] == 1 and nums[i+1] == 2 and nums[i+2] == 3:
      return True;
    i+=1;
  return False;
