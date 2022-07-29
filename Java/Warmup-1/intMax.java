public int intMax(int a, int b, int c) {
  // return Math.max(Math.max(a, b), c);
  return twoNumbers(twoNumbers(a, b), c);
}

public int twoNumbers(int a, int b) {
  return a < b ? b: a;
}

