public String doubleChar(String str) {
  String str2 = "";
  for(int i=0; i<str.length(); i++){
    str2+=str.charAt(i);
    str2+=str.charAt(i);
  }
  return str2;
}
