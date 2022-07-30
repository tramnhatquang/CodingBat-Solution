public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (bOk)
  {
    return c > b;
  }
  return (b > a && c > b);
}
