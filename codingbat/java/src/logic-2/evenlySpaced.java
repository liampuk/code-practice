public boolean evenlySpaced(int a, int b, int c) {
  return a-b == b-c || a-c == c-b || b-a == a-c;
}
