public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  String cc = "";
  for(int i=0; i<strings.length; i++){
    cc = String.valueOf(strings[i].charAt(0));
    if(map.get(cc) == null){
      map.put(cc , strings[i]);
    }else{
      map.put(cc, map.get(cc)+strings[i]);
    }
  }
  return map;
}
