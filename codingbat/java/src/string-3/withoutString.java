public String withoutString(String base, String remove) {
  for(int i=0; i<base.length()-remove.length()+1; i++){
    if(base.substring(i, i+remove.length()).toLowerCase().equals(remove.toLowerCase())){
      base = base.substring(0,i)+base.substring(i+remove.length());
      i-= i >= remove.length() ? remove.length() : 1;
    }
  }
  return base;
}
