public int blackjack(int a, int b) {
  if (a > 21  && b > 21)
    return 0;
  else if (a > 21 && b <= 21)
    return b;
  else if (a <= 21 && b > 21)
    return a;
  int diffA = Math.abs(a - 21);
  int diffB = Math.abs(b - 21);
  if (diffA < diffB)
    return a;
  return b;
}
