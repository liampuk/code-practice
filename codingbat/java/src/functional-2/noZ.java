public List<String> noZ(List<String> strings) {
  strings.removeIf(s -> containsZ(s));
  return strings;
}
public boolean containsZ(String s){
  for(int i=0; i<s.length(); i++){
    if(s.charAt(i) == 'z'){
      return true;
    }
  }
  return false;
}
