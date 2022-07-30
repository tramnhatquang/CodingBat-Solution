public int sumLimit(int a, int b) {
  int sum = a + b;
  int lenSum = String.valueOf(sum).length();
  int lenA = String.valueOf(a).length();
  if (lenSum == lenA)
    return sum;
  return a;
}
