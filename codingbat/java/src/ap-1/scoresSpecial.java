public int scoresSpecial(int[] a, int[] b) {
  return largestSpecial(a)+largestSpecial(b);
}
public int largestSpecial(int[] a){
  int max = 0;
  for(int i=0; i<a.length; i++){
    if(a[i]%10 == 0) max = a[i] > max ? a[i] : max;
  }
  return max;
}
