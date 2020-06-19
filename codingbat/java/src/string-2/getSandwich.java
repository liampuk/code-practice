public String getSandwich(String str) {
  int firstBread = -1;
  int secondBread = -1;
  for(int i=0; i<str.length()-4; i++){
    if(str.substring(i,i+5).equals("bread")){
      if(firstBread >= 0){
        secondBread = i;
      }else{
        firstBread = i+5;
      }
    }
  }
  if(firstBread >= 0 && secondBread >= 0){
    return str.substring(firstBread, secondBread);
  }
  return "";
}
