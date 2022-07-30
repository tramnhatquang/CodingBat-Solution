public boolean shareDigit(int a, int b) {
  if (10 <= a && a <= 99 && 10 <= b && b<= 99)
  {
    int firstA = a / 10;
    int lastA = a % 10;
    int firstB = b / 10;
    int lastB = b % 10;
    return firstA == firstB || firstA == lastB || lastA == lastB || lastA == firstB;
  }
  
  return false;
  
}
