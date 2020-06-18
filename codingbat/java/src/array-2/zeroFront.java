public int[] zeroFront(int[] nums) {
  int temp;
  boolean unSorted = true;
  while(unSorted){
    unSorted = false;
    for(int i=0; i<nums.length-1; i++){
    if(Math.abs(nums[i]) > Math.abs(nums[i+1])){
      temp = nums[i+1];
      nums[i+1] = nums[i];
      nums[i] = temp;
      unSorted = true;
    }
  }
  }
  
  return nums;
}
