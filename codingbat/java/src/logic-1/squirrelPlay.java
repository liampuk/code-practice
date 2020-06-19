public boolean squirrelPlay(int temp, boolean isSummer) {
  return temp >= 60 && (temp <= 90 || (temp <= 100 && isSummer));
}
