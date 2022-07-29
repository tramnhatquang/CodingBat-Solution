public int max1020(int a, int b) {
  // first make it so the bigger value is in a
  if (a < b)
  {
    int temp = a;
    a = b;
    b = temp;
  }
  
  // a is always the bigger value
  // check a first
    if (a >= 10 && a <= 20) return a;
    if (b >= 10 && b <= 20) return b;
  return 0;
}
