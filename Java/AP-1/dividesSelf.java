public boolean dividesSelf(int n) {
  int originalNum = n;
  while (n > 0)
  {
    int digit = n % 10;
    if (digit == 0 || originalNum % digit != 0 )
      return false;
    n /= 10;
  }
  return true;
}
