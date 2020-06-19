public String mixString(String a, String b) {
  String str = "";
  while(a.length() > 0 && b.length() > 0){
    str+=a.charAt(0);
    str+=b.charAt(0);
    a = a.substring(1);
    b = b.substring(1);
  }
  return str+a+b;
}
