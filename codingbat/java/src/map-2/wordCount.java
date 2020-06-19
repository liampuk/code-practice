public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(int i=0; i<strings.length; i++){
    if(map.get(strings[i]) == null){
      map.put(strings[i], 1);
    }else{
      map.put(strings[i], map.get(strings[i])+1);
    }
  }
  return map;
}
