public int matchUp(String[] a, String[] b) {
  int len = a.length;
  int count = 0;
  
  for (int i = 0; i < len; ++i)
  {
    if (a[i].equals("") || b[i].equals(""))
      continue;
    // both strings are not empty at this point
    if (a[i].charAt(0) == b[i].charAt(0))
      count++;
  }
  return count;
  
  
}
