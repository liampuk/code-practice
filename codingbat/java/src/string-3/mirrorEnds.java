public String mirrorEnds(String string) {
  String s = "";
  for(int i=0; i<string.length(); i++){
    if(string.charAt(i) == string.charAt(string.length()-i-1)){
      s+=string.charAt(i);
    }else{
      return s;
    }
  }
  return s;
}
