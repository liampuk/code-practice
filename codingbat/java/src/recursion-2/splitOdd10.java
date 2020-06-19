public boolean splitOdd10(int[] nums) {
  return splitOdd10Helper(0, nums, 0, 0);
}
public boolean splitOdd10Helper(int start, int[] nums, int group1, int group2){
  if(start >= nums.length) return group1%10 == 0 && group2%2 == 1;
  if(splitOdd10Helper(start+1, nums, group1+nums[start], group2)){
    return true;
  }
  return splitOdd10Helper(start+1, nums, group1, group2+nums[start]);
}
