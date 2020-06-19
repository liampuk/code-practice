public int max1020(int a, int b) {
  int large = a >= 10 && a <= 20 ? a : 0;
  if((b >= 10 && b <= 20 ? b : 0) > large){
    return (b >= 10 && b <= 20 ? b : 0);
  }
  return large;
}
