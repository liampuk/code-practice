public boolean prefixAgain(String str, int n) {
  for(int i=1;i<str.length()-n+1;i++){
    if(str.substring(i,i+n).equals(str.substring(0,n))){
      return true;
    }
  }
  return false;
}
