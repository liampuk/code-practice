public int maxSpan(int[] nums) {
  if(nums.length == 0){
    return 0;
  }
  int max = 1;
  int cSpan = 0;
  for(int i=0; i<nums.length; i++){
    for(int j=i; j<nums.length; j++){
      cSpan++;
      if(i != j && nums[j] == nums[i]){
        if(cSpan > max){
          max = cSpan;
        }
      }
    }
    cSpan = 0;
  }
  return max;
}
