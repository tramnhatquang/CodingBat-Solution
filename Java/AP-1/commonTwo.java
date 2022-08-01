public int commonTwo(String[] a, String[] b) {
  int count = 0;
  int aIndex = 0, bIndex = 0;
  while (aIndex < a.length && bIndex < b.length)
  {
    // move to the next index if we have duplicates
    while (aIndex + 1 < a.length && a[aIndex].equals(a[aIndex+1]))
      aIndex++;
    while (bIndex + 1 < b.length && b[bIndex].equals(b[bIndex+1]))
      bIndex++;  
    int val = a[aIndex].compareTo(b[bIndex]);
    if (val == 0)
    {
      count++;
      aIndex++;
      bIndex++;
    } else if (val < 0)
      aIndex++;
    else
      bIndex++;
  }
  return count;
}
