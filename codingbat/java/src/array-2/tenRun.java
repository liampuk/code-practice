public int[] tenRun(int[] nums) {
  int overwrite = -1;
  for(int i=0; i<nums.length; i++){
    if(nums[i]%10 == 0){
      overwrite = nums[i];
    }
    if(overwrite >= 0){
      nums[i] = overwrite;
    }
  }
  return nums;
}
