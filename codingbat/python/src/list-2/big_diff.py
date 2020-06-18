def big_diff(nums):
  min_val = nums[0];
  max_val = nums[0];
  i = 0;
  while i < len(nums):
    min_val = min(min_val, nums[i]);
    max_val = max(max_val, nums[i]);
    i += 1;
  return max_val-min_val;
