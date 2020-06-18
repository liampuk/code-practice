public boolean has271(int[] nums) {
  int check = 1;
  for(int i = 1; i < nums.length; i++){
    if(check == 1 && nums[i] == nums[i-1]+5){
      check++;
    }else if(check == 2 && nums[i] >= nums[i-2]-3 && nums[i] <= nums[i-2]+1){
      check++;
    }else{
      check = 1;
    }
    if(check == 3){
      return true;
    }
  }
  return false;
}
