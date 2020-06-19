public String everyNth(String str, int n) {
  String res = str.charAt(0)+"";
  for(int i=n; i<str.length(); i+=n){
    res+=str.charAt(i);
  }
  return res;
}
