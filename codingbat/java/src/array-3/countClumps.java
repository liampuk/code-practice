public int countClumps(int[] nums) {
  if(nums.length == 0){
    return 0;
  }
  int clumps;
  if(nums.length >= 2 && nums[0] == nums[1]){
    clumps = 1;
  }else{
    clumps = 0;
  }
  for(int i=1; i<nums.length-1; i++){
    if(nums[i] != nums[i-1] && nums[i] == nums[i+1]){
      clumps++;
    }
  }
  return clumps;
}
