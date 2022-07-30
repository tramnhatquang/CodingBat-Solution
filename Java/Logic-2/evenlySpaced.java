public boolean evenlySpaced(int a, int b, int c) {
  if (a == b && b == c)
    return true;
  else if (a == b || b == c || a == c)
    return false;
  return Math.abs(a - b) == Math.abs(a - c) || Math.abs(a - b) == Math.abs(b - c)||
  Math.abs(c - b) == Math.abs(a - c);
}
