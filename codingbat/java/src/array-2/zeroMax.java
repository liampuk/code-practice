public int[] zeroMax(int[] nums) {
  int max = 0;
  for(int i=nums.length-1; i>= 0; i--){
    max = nums[i] > max && nums[i]%2 == 1 ? nums[i] : max;
    if(nums[i] == 0){
      nums[i] = max;
    }
  }
  return nums;
}
