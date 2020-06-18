public int greenTicket(int a, int b, int c) {
  return a == b && b == c ? 20 : a == b || b == c || a == c ? 10 : 0;
}
