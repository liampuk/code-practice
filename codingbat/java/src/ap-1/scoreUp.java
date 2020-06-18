public int scoreUp(String[] key, String[] answers) {
  int mark = 0;
  for(int i=0; i<key.length; i++){
    if(answers[i].equals(key[i])){
      mark+= 4;
    }else if(!key[i].equals("?") && !answers[i].equals("?")){
      mark--;
    }
  }
  return mark;
}
