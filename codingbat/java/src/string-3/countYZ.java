public int countYZ(String str) {
  int count = 0;
  for(int i = 0; i<str.length(); i++){
    if((str.toLowerCase().charAt(i) == 'z' || str.toLowerCase().charAt(i) == 'y') && (i == str.length()-1 || !Character.isLetter(str.charAt(i+1)))){
      count++;
    }
  }
  return count;
}
