public int stringMatch(String a, String b) {
  int count = 0;
  for(int i=0; i<(a.length() < b.length() ? a.length() : b.length())-1; i++){
    if(a.substring(i,i+2).equals(b.substring(i,i+2))){
      count++;
    }
  }
  return count;
}
