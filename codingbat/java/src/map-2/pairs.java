public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for(int i=0; i<strings.length; i++){
    map.put(String.valueOf(strings[i].charAt(0)), String.valueOf(strings[i].charAt(strings[i].length()-1)));
  }
  return map;
}
