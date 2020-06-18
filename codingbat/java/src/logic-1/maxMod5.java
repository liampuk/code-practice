public int maxMod5(int a, int b) {
  return a == b ? 0 : a % 5 == b % 5 ? a > b ? b : a : a > b ? a : b;
}
