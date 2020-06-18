public String[] firstSwap(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
  String cc = "";
  for(int i=0; i<strings.length; i++){
    cc = String.valueOf(strings[i].charAt(0));
    if(map.get(cc) == null){
      map.put(cc, i);
    }else if(map.get(cc)>=0){
      String temp = strings[i];
      strings[i] = strings[map.get(cc)];
      strings[map.get(cc)] = temp;
      map.put(cc, -1);
    }
  }
  return strings;
}
