public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  String holder = "";
  for(int i=0; i<strings.length; i++){
    if(map.get(strings[i]) == null){
      map.put(strings[i], 1);
    }else{
      map.put(strings[i], map.get(strings[i])+1);
      if(map.get(strings[i])%2 == 0){
        holder+=strings[i];
      }
    }
  }
  return holder;
}
