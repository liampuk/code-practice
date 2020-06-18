public String startOz(String str) {
  String str2 = "";
  if(str.length()>0 && str.charAt(0) == 'o'){
    str2+="o";
  }
  if(str.length()>1 && str.charAt(1) == 'z'){
    str2+="z";
  }
  return str2;
}
