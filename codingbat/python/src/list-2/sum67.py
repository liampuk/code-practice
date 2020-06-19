def sum67(nums):
  sum = 0;
  no_skip = True;
  i = 0;
  while i < len(nums):
    if no_skip and nums[i] != 6:
      sum += nums[i];
    if nums[i] == 6:
      no_skip = False;
    if nums[i] == 7:
      no_skip = True;
    i += 1;
  return sum;
