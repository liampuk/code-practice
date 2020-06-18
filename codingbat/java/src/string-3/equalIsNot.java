public boolean equalIsNot(String str) {
  int isCount = 0;
  int notCount = 0;
  for(int i=0; i<str.length(); i++){
    if(str.length()>=i+3 && str.substring(i,i+3).equals("not")){
      notCount++;
    }
    if(str.length()>=i+2 && str.substring(i,i+2).equals("is")){
      isCount++;
    }
  }
  return isCount == notCount;
}
