public int maxBlock(String str) {
  char currChar;
  int max = 0;
  for(int i=0; i<str.length(); i++){
    currChar = str.charAt(i);
    for(int j=i; j<str.length(); j++){
      if(str.charAt(j) == currChar){
        max = j-i+1 > max ? j-i+1 : max;
      }else{
        break;
      }
    }
  }
  return max;
}
