public String seeColor(String str) {
  return (str.length()>=3 && str.substring(0,3).equals("red")) ? "red" : (str.length()>=4 && str.substring(0,4).equals("blue")) ? "blue" : "";
}
