public int scoresAverage(int[] scores) {
  int lhs = average(scores, 0, scores.length/2);
  int rhs = average(scores, scores.length/2, scores.length);
  return lhs > rhs ? lhs : rhs;
}
public int average(int[] scores, int start, int end) {
  int avg = 0;
  for(int i=start; i<end; i++){
    avg+=scores[i];
  }
  return avg/(end-start);
}
