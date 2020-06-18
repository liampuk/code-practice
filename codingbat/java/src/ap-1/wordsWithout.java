public String[] wordsWithout(String[] words, String target) {
  String arrBuilder = "";
  for(int i=0; i<words.length; i++){
    if(words[i] != target) arrBuilder+=","+words[i];
  }
  return arrBuilder.substring(1).split(",");
}
