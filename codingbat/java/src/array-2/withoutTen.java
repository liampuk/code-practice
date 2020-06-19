public int[] withoutTen(int[] nums) {
  int shiftCount = 0;
  for(int i=0; i<nums.length; i++){
    if(i+shiftCount >= nums.length){
      nums[i] = 0;
    }else{
      nums[i] = nums[i+shiftCount];
    }
    if(nums[i] == 10){
      shiftCount++;
      i-=1;
    }
  }
  return nums;
}
