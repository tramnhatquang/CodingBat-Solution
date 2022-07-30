public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if (equalOk)
  {
    return a <= b & b <= c;
  }
  // the other case
  return a < b && b < c;
}
