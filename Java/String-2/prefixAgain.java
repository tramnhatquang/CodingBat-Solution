public boolean prefixAgain(String str, int n) {
  String sub = str.substring(0, n);
  for (int i = n; i < str.length() - n + 1; ++i) {
    if (str.substring(i, i+n).equals(sub))
      return true;
  }
  return false;
  
  
}
