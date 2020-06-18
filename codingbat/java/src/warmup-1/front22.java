public String front22(String str) {
  int len = str.length() >= 2 ? 2 : str.length();
  String str2 = str.substring(0,len);
  return str2+str+str2;
}
