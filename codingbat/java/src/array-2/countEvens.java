public int countEvens(int[] nums) {
  int c = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] % 2 == 0){
      c++;
    }
  }
  return c;
}
