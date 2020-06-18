public String twoChar(String str, int index) {
  return str.length() >= index+2 && index >= 0 ? str.substring(index,index+2) : str.substring(0,2);
}
