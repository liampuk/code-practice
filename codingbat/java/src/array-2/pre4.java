public int[] pre4(int[] nums) {
  int size = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 4){
      size = i;
      break;
    }
  }
  int[] arr = new int[size];
  for(int i=0; i<size; i++){
    arr[i] = nums[i];
  }
  return arr;
}
