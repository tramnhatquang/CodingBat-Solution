public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] res = new String[n];
  int aIndex = 0, bIndex = 0;
  for (int i = 0; i < n; i++)
  {
    int val = a[aIndex].compareTo(b[bIndex]);
    if (val < 0)
    {
      res[i] = a[aIndex++];
    } else if (val > 0)
      res[i] = b[bIndex++];
    else{
      res[i] = a[aIndex++];
      bIndex++;
    }
  }
  return res;  
}

