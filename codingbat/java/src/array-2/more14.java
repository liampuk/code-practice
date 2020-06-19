public boolean more14(int[] nums) {
  int oneC = 0;
  int fourC = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 1){
      oneC++;
    }else if(nums[i] == 4){
      fourC++;
    }
  }
  return oneC > fourC;
}
