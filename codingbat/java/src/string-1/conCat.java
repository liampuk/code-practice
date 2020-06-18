public String conCat(String a, String b) {
  if(a.length() > 0 && b.length() > 0 && a.charAt(a.length()-1) == b.charAt(0)){
    a = a.substring(0,a.length()-1);
  }
  return a+b;
}
