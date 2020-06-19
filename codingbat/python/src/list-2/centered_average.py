def centered_average(nums):
  min_val = nums[0];
  max_val = nums[0];
  sum = 0;
  i = 0;
  while i < len(nums):
    min_val = min(min_val, nums[i]);
    max_val = max(max_val, nums[i]);
    sum += nums[i];
    i += 1;
  return (sum-max_val-min_val)/(len(nums)-2);
