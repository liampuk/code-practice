public boolean twoAsOne(int a, int b, int c) {
  return a + b == c ? true : a + c == b ? true : c + b == a ? true : false;
}
