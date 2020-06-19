public int sum13(int[] nums) {
  int c = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 13){
      i++;
    }else{
      c+= nums[i];
    }
  }
  return c;
}
