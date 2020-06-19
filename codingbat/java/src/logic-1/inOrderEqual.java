public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  return c > b || (equalOk && c >= b) ? b > a || (equalOk && b >= a) : false;
}
