public boolean closeFar(int a, int b, int c) {
  if((b <= a+1 && b >= a-1) && (c >= a+2 || c <= a-2) && (c >= b+2 || c <= b-2)){
    return true;
  }
  if((c <= a+1 && c >= a-1) && (b >= a+2 || b <= a-2) && (b >= c+2 || b <= c-2)){
    return true;
  }
  return false;
}
