public boolean hasBad(String str) {
  if(str.length() >= 4){
    return str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad");
  }
  return str.length() >= 3 ? str.substring(0,3).equals("bad") : false;
}
