public int caughtSpeeding(int speed, boolean isBirthday) {
  int add = isBirthday ? 5 : 0;
  if(speed <= 60+add){
    return 0;
  }
  if(speed >= 61+add && speed <= 80+add){
    return 1;
  }
  return 2;
}
