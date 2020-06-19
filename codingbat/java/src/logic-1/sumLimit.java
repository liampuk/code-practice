public int sumLimit(int a, int b) {
  int sum = a+b;
  return String.valueOf(sum).length() == String.valueOf(a).length() ? sum : a;
}
