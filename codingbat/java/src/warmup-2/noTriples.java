public boolean noTriples(int[] nums) {
  int trippleCount = 1;
  for(int i = 1; i<nums.length; i++){
    if(nums[i] == nums[i-1]){
      trippleCount++;
    }else{
      trippleCount = 1;
    }
    if(trippleCount == 3){
      return false;
    }
  }
  return true;
}
