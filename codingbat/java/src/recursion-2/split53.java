public boolean split53(int[] nums) {
  return split53Helper(0, nums, 0, 0);
}
public boolean split53Helper(int start, int[] nums, int group1, int group2){
  if(start >= nums.length) return group1 == group2;
  if(nums[start]%5 == 0){
    return split53Helper(start+1, nums, group1+nums[start], group2);
  }
  if(nums[start]%3 == 0){
    return split53Helper(start+1, nums, group1, group2+nums[start]);
  }
  if(split53Helper(start+1, nums, group1+nums[start], group2)){
    return true;
  }
  return split53Helper(start+1, nums, group1, group2+nums[start]);
}
