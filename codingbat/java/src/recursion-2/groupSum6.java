public boolean groupSum6(int start, int[] nums, int target) {
  if(start >= nums.length) return target == 0;
  if(groupSum6(start+1, nums, target-nums[start])){
    return true;
  }
  if(nums[start] == 6){
    return groupSum6(start+1, nums, target-6);
  }else{
    return groupSum6(start+1, nums, target);
  }
}
