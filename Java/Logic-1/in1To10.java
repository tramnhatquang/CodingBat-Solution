public boolean in1To10(int n, boolean outsideMode) {
  if (outsideMode)
  {
    return (n <= 1 || n >= 10 );
  }
  return (1 <= n && n <= 10);
}
