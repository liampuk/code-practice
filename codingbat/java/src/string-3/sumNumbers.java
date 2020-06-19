public int sumNumbers(String str) {
  int sIndex = 0;
  int sum = 0;
  for(int i=0; i<str.length(); i++){
    if(Character.isDigit(str.charAt(i))){
      sIndex = i;
      while(i < str.length() && Character.isDigit(str.charAt(i))){
        i++;
      }
      sum += Integer.parseInt(str.substring(sIndex, i));
    }
  }
  return sum;
}
