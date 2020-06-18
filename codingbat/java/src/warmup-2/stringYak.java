public String stringYak(String str) {
  String res = "";
  for(int i=0; i<str.length(); i++){
    if(i < str.length() -2 && str.substring(i, i+3).equals("yak")){
      i+=2;
    }else{
      res+=str.charAt(i);
    }
  }
  return res;
}
