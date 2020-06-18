public boolean has12(int[] nums) {
  boolean oneHere = false;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 1){
      oneHere = true;
    }
    if(oneHere && nums[i] == 2){
      return true;
    }
  }
  return false;
}
