public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap<String, Boolean>();
  for(int i=0; i<strings.length; i++){
    if(map.get(strings[i]) == null){
      map.put(strings[i], false);
    }else{
      map.put(strings[i], true);
    }
  }
  return map;
}
