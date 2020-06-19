public String altPairs(String str) {
  String res = "";
  for(int i=0; i<str.length(); i++){
    res += str.charAt(i);
    if(i%2==1){
      i+=2;
    }
  }
  return res;
}
