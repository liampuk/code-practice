public int[] squareUp(int n) {
  int allocate;
  int[] arr = new int[n*n];
  for(int i=0; i<n*n; i++){
    allocate = (i%n+1)+(i/n)-n+1 > 0 ? 1 : 0;
    arr[i] = allocate == 1 ? n-(i%n) : 0;
  }
  return arr;
}
