public boolean hasOne(int n) {
  if(n<10) return n%10 == 1;
  return n%10 == 1 ? true : hasOne(n/10);
}
