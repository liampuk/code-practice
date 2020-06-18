def array_front9(nums):
  check = 3 if len(nums) >= 4 else len(nums)-1;
  count = 0;
  while check >= 0:
    if nums[check] == 9:
      return True;
    check -= 1;
  return False;
