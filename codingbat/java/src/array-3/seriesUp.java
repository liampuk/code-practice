public int[] seriesUp(int n) {
  int[] arr = new int[n*(n+1)/2];
  int index = 0;
  for(int i=0; i<n; i++){
    for(int j=0; j<i+1;j++){
      arr[index] = j+1;
      index++;
    }
  }
  return arr;
}
