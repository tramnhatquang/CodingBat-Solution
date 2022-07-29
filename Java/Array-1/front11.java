public int[] front11(int[] a, int[] b) {
  int lenA = a.length, lenB = b.length;
  if (lenA == 0 && lenB == 0)
    return new int[0];
  else if (lenA > 0 && lenB > 0)
    return new int[] {a[0], b[0]};
  else if (lenA == 0)
    return new int[] {b[0]};
  return new int[] {a[0]};
  
}
