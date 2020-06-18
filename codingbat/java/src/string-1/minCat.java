public String minCat(String a, String b) {
  if(a.length() > b.length()){
    a = a.substring(a.length()-b.length());
  }else{
    b = b.substring(b.length()-a.length());
  }
  return a+b;
}
