public int scoresSpecial(int[] a, int[] b) {
  return findSpecial(a) + findSpecial(b);
}

public int findSpecial(int[] a)
{
  int max = 0;
  for (int num: a) {
    if (num % 10 == 0)
      max = Math.max(max, num);
  }
  return max;
}
