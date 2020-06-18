public boolean dividesSelf(int n) {
  int hold = n;
  while(n>0){
    if((n%10) == 0 || hold%(n%10) != 0){
      return false;
    }
    n=n/10;
  }
  return true;
}
