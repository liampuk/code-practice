public int userCompare(String aName, int aId, String bName, int bId) {
  if(aName.compareTo(bName) == 0){
    if(aId > bId){
      return 1;
    }
    if(aId < bId){
      return -1;
    }
  }else{
    return aName.compareTo(bName) > 0 ? 1 : -1;
  }
  return 0;
}
