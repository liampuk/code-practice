public String sameEnds(String string) {
  int count = 0;
  for(int i=0; i < string.length()/2+1; i++){
    if(string.substring(0,i).equals(string.substring(string.length()-i))){
      count = i;
    }
  }
  return string.substring(0,count);
}
