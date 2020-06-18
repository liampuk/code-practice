public boolean scoresIncreasing(int[] scores) {
  int prev = scores[0];
  for(int i=1;i<scores.length;i++){
    if(prev > scores[i]){
      return false;
    }
    prev = scores[i];
  }
  return true;
}
