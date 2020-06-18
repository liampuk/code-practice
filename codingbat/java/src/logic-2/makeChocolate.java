public int makeChocolate(int small, int big, int goal) {
  int bigUsed = (int)goal/5;
  if(small >= goal-(5*(bigUsed > big ? big : bigUsed))){
    return goal-(5*(bigUsed > big ? big : bigUsed));
  }
  return -1;
}
