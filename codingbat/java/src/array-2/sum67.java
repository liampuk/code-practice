public int sum67(int[] nums) {
  boolean count = true;
  int c = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 6){
      count = false;
    }
    c += count ? nums[i] : 0;
    if(nums[i] == 7){
      count = true;
    }
  }
  return c;
}
