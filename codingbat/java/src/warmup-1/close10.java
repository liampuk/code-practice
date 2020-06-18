public int close10(int a, int b) {
  int a2 = Math.abs(a-10);
  int b2 = Math.abs(b-10);
  if(a2 == b2){
    return 0;
  }
  return a2 < b2 ? a : b;
}
