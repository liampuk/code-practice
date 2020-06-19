public int[] copyEvens(int[] nums, int count) {
  int[] arr = new int[count];
  int arrIndex = 0;
  for(int i=0; i<nums.length && arrIndex<count; i++){
    if(nums[i]%2 == 0){
      arr[arrIndex] = nums[i];
      arrIndex++;
    }
  }
  return arr;
}
