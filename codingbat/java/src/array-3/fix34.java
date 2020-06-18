public int[] fix34(int[] nums) {
  int temp;
  int prevSwap = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 3){
      for(int j=prevSwap; j<nums.length; j++){
        if(nums[j] == 4){
          temp = nums[i+1];
          nums[i+1] = nums[j];
          nums[j] = temp;
          prevSwap = j;
          break;
        }
      }
    }
  }
  return nums;
}
