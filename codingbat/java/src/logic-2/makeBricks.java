public boolean makeBricks(int small, int big, int goal) {
  int bigUsed = (int)goal/5;
  int rem = goal%5;
  if((bigUsed <= big && goal-(5*bigUsed) <= small) || (bigUsed > big && goal-(5*big) <= small)){
    return true;
  }
  return false;
}
