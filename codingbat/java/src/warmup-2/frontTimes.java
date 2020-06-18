public String frontTimes(String str, int n) {
  String res = "";
  int len = str.length() >= 3 ? 3 : str.length();
  for(int i=0; i<n; i++){
    res+=str.substring(0, len);
  }
  return res;
}
