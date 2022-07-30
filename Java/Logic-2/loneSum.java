public int loneSum(int a, int b, int c) {
  int sum = 0;
  if (a != b && a != c) sum += a;
  if (b != a && b != c) sum += b;
  if (c != b && c != a) sum += c;
  return sum;
}
