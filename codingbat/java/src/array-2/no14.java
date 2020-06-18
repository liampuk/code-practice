public boolean no14(int[] nums) {
  boolean containsOne = false;
  boolean containsFour = false;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 1){
      containsOne = true;
      if(containsFour){
        return false;
      }
    }if(nums[i] == 4){
      containsFour = true;
      if(containsOne){
        return false;
      }
    }
  }
  return true;
}
