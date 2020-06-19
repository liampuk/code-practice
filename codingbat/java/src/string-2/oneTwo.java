public String oneTwo(String str) {
  String store = "";
  String s = "";
  for(int i=0; i<str.length() - str.length()%3; i++){
    if(i%3 == 0){
      s+= store;
      store = str.charAt(i)+"";
    }else{
      s += str.charAt(i)+"";
    }
  }
  return s+store;
}
