public int factorial(int n) {
  // base case
  if (n <= 2)
    return n;
  return factorial(n - 1) * n;
}
