public boolean inOrder(int a, int b, int c, boolean bOk) {
  return b > a || bOk ? c > b : false;
}
