public boolean specialEleven(int n) {
  if (n % 11 == 0 || (n - 1) % 11 == 0)
    return true;
  return false;
}
