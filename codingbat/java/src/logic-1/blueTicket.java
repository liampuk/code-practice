public int blueTicket(int a, int b, int c) {
  return a+b == 10 || b+c == 10 || a+c == 10 ? 10 : a+b == b+c+10 || a+b == a+c+10 ? 5 : 0;
}
