public boolean linearIn(int[] outer, int[] inner) {
  if(outer.length == 0 || inner.length == 0){
    return true;
  }
  int checkOffset = 0;
  for(int i=0; i<outer.length; i++){
    if(outer[i] == inner[checkOffset]){
      checkOffset++;
      if(checkOffset >= inner.length){
        return true;
      }
    }
  }
  return false;
}
