public int[] fix45(int[] nums) {
  int temp;
  for(int i=0; i<nums.length-1; i++){
    if(nums[i] == 4){
      for(int j=0; j<nums.length; j++){
        if(nums[j] == 5 && (j>0 ? nums[j-1] != 4 : true)){
          temp = nums[i+1];
          nums[i+1] = nums[j];
          nums[j] = temp;
        }
      }
    }
  }
  return nums;
}
