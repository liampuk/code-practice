public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] arr = new String[n];
  int aIndex = 0;
  int bIndex = 0;
  
  for(int i=0; i<n; i++){
    if(a[aIndex].compareTo(b[bIndex])==0){
      arr[i] = a[aIndex];
      aIndex++;
      bIndex++;
    }else if(a[aIndex].compareTo(b[bIndex])>0){
      arr[i] = b[bIndex];
      bIndex++;
    }else if(a[aIndex].compareTo(b[bIndex])<0){
      arr[i] = a[aIndex];
      aIndex++;
    }else{
      if(aIndex > bIndex){
        bIndex++;
      }else{
        aIndex++;
      }
    }
  }
  return arr;
}
