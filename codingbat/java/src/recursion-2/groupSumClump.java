public boolean groupSumClump(int start, int[] nums, int target) {
  if(start >= nums.length) return target == 0;
  int adj = nums[start];
  for(int i=start+1; i<nums.length; i++){
    if(nums[i] == nums[start]){
      adj+=nums[i];
    }else{
      if(groupSumClump(i, nums, target-adj)){
        return true;
      }else{
       return groupSumClump(i, nums, target);
      }
    }
  }
  return groupSumClump(start+1, nums, target-nums[start]);
}
