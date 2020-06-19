public int sumHeights2(int[] heights, int start, int end) {
  int change = 0;
  for(int i=start; i<end; i++){
    if(heights[i+1]-heights[i]>0){
      change+=heights[i+1]-heights[i];
    }
      change+=Math.abs(heights[i+1]-heights[i]);
  }
  return change;
}
