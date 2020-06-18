public String repeatSeparator(String word, String sep, int count) {
  String str2 = "";
  for(int i=0;i<count;i++){
    str2 += word+sep;
  }
  return str2.substring(0,str2.length()-sep.length());
}
