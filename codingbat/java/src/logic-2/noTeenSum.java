public int noTeenSum(int a, int b, int c) {
  return fixTeen(a)+fixTeen(b)+fixTeen(c);
}
public int fixTeen(int n){
  return n < 13 || n > 19 ? n : n != 15 && n != 16 ? 0 : n;
}
