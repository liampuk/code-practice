public String atFirst(String str) {
  return str.length() >= 2 ? str.substring(0,2) : str.length() == 1 ? str.substring(0,1)+"@" : "@@";
}
