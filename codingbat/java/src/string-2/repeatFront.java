public String repeatFront(String str, int n) {
  String str2 = "";
  while(n>0){
    str2 += str.substring(0,n);
    n--;
  }
  return str2;
}
