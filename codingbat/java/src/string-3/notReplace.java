public String notReplace(String str) {
  for(int i=0; i<str.length()-1; i++){
    if(str.substring(i, i+2).equals("is")){
      if(i-1 < 0 || !Character.isLetter(str.charAt(i-1))){
        if(i+3 > str.length() || !Character.isLetter(str.charAt(i+2))){
          str = fix(str,i);
        }
      }
    }
  }
  return str;
}
public String fix(String str, int i){
  return str = str.substring(0,i+2)+" not"+str.substring(i+2);
}
