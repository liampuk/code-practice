def array_count9(nums):
  count = 0;
  i = 0;
  while i < len(nums):
    if nums[i] == 9:
      count += 1;
    i += 1;
  return count;
