public boolean sum28(int[] nums) {
  int c = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 2){
      c+= 2;
    }
  }
  return c == 8;
}
