public boolean gHappy(String str) {
  boolean happy = true;
  boolean skip = false;
  for(int i=0; i<str.length(); i++){
    if(str.charAt(i) == 'g'){
      if((i == str.length()-1 && !skip) || (i != str.length()-1 && str.charAt(i+1) != 'g') && !skip){
        happy = false;
      }else{
        happy = true;
        skip = true;
      }
    }else{
      skip = false;
    }
  }
  return happy;
}
