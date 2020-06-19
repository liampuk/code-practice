public boolean splitArray(int[] nums) {
  return sum(0, nums, 0, 0);
}
public boolean sum(int start, int[] nums, int group1, int group2) {
  if(start >= nums.length) return group1 == group2;
  if(sum(start+1, nums, group1+nums[start], group2)){
    return true;
  }
  return sum(start+1, nums, group1, group2+nums[start]);
}
