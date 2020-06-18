def sum2(nums):
  count = 0;
  i = 0;
  for x in nums:
    count += x;
    i += 1;
    if i >= 2:
      break;
  return count;
