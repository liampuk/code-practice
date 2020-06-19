public String extraFront(String str) {
  String newStr = "";
  if(str.length()>=2){
    newStr = str.substring(0,2);
  }else{
    newStr = str;
  }
  return newStr+newStr+newStr;
}
