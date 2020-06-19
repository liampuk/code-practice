public String repeatEnd(String str, int n) {
  String str2 = "";
  for(int i=0; i<n; i++){
    str2 += str.substring(str.length()-n);
  }
  return str2;
}
