public int intMax(int a, int b, int c) {
  if(a > b){
    return a > c ? a : c > b ? c : b;
  }
  return b > c ? b : c > a ? c : c;
}
