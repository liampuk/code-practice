public int[] fizzArray3(int start, int end) {
  int[] arr = new int[end-start];
  for(int i=0; i<end-start; i++){
    arr[i] = start+i;
  }
  return arr;
}
