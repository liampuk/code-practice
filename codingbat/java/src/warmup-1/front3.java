public String front3(String str) {
  int len = str.length() >= 3 ? 3 : str.length();
  String str2 = str.substring(0,len);
  return str2+str2+str2;
}
