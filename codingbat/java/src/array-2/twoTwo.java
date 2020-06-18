public boolean twoTwo(int[] nums) {
  boolean check = true;
  int lastValue = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 2){
      if(lastValue != 2){
        check = false;
      }else{
        check = true;
      }
    }
    lastValue = nums[i];
  }
  return check;
}
