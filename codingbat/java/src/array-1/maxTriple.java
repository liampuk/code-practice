public int maxTriple(int[] nums) {
  if(nums[0] > nums[nums.length/2] && nums[0] > nums[nums.length-1]){
    return nums[0];
  }
  if(nums[nums.length-1] > nums[0] && nums[nums.length-1] > nums[nums.length/2]){
    return nums[nums.length-1];
  }
  return nums[nums.length/2];
}
