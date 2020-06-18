public int redTicket(int a, int b, int c) {
  return a == b && b == c ? a == 2 ? 10 : 5 : a != b && a != c ? 1 : 0;
}
