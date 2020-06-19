public int maxMirror(int[] nums) {
  int max = 0;
  int curMax = 0;
  for(int i=0; i<nums.length; i++){
    for(int j=nums.length-1; j>= 0; j--){
      if(nums[i] == nums[j]){
        for(int z=0; i+z<nums.length && j-z>=0; z++){
          if(nums[i+z] == nums[j-z]){
            curMax++;
            max = curMax > max ? curMax : max;
          }else{
            break;
          }
        }
        curMax = 0;
      }
    }
  }
  return max;
}
