public int[] maxEnd3(int[] nums) {
  int big = 0;
  if(nums[0] > nums[nums.length-1]){
    big = nums[0];
  }else{
    big = nums[nums.length-1];
  }
  return new int[]{big, big, big};
}
