public int fibonacci(int n) {
  return n == 1 || n == 0 ? n : fibonacci(n-2) + fibonacci(n-1);
}
