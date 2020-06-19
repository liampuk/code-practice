public int[] copyEndy(int[] nums, int count) {
  int[] arr = new int[count];
  int arrIndex = 0;
  for(int i=0; i<nums.length && arrIndex<count; i++){
    if(isEndy(nums[i])){
      arr[arrIndex] = nums[i];
      arrIndex++;
    }
  }
  return arr;
}
public boolean isEndy(int n){
  return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
}
