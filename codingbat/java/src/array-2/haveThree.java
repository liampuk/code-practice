public boolean haveThree(int[] nums) {
  int prevThree = -2;
  int count = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 3){
      count++;
      if(i == prevThree+1){
        return false;
      }
      prevThree = i;
    }
  }
  return count == 3;
}
