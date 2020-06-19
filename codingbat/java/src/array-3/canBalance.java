public boolean canBalance(int[] nums) {
  int sum = 0;
  int sumLeft = 0;
  for(int i=0; i<nums.length; i++){
    sum += nums[i];
  }
  for(int j=0; j<nums.length; j++){
    sum-=nums[j];
    sumLeft+=nums[j];
    if(sum == sumLeft){
      return true;
    }
  }
  return false;
}
