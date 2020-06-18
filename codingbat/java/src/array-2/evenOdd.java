public int[] evenOdd(int[] nums) {
  int temp;
  boolean notSorted = true;
  while(notSorted){
    notSorted = false;
    for(int i=0; i<nums.length-1; i++){
      if(nums[i]%2 == 1 && nums[i+1]%2 == 0){
        temp = nums[i+1];
        nums[i+1] = nums[i];
        nums[i] = temp;
        notSorted = true;
      }
    }
  }
  return nums;
}
