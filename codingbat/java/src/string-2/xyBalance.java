public boolean xyBalance(String str) {
  boolean last = true;
  for(int i=0; i<str.length(); i++){
    if(str.charAt(i) == 'x'){
      last = false;
    }else if(str.charAt(i) == 'y'){
      last = true;
    }
  }
  return last;
}
