public int[] biggerTwo(int[] a, int[] b) {
  int sumA = 0, sumB = 0;
  for (int num: a)
    sumA += num;
  for (int num: b)
    sumB += num;
  if (sumA < sumB)
    return b;
  return a;
}
