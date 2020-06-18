public int commonTwo(String[] a, String[] b) {
  int count = 0;
  int jStart = 0;
  String lastChecked = "";
  
  for(int i=0; i<a.length; i++){
    for(int j=jStart; j<b.length; j++){
      if(a[i].equals(b[j]) && !a[i].equals(lastChecked)){
        count++;
        jStart = j;
        lastChecked = a[i];
      }
    }
  }
  return count;
}
