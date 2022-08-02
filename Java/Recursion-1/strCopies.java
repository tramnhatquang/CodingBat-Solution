public boolean strCopies(String str, String sub, int n) {
  // base case
  if (str.length() < sub.length())
    return n == 0;
    
  int lenSub = sub.length();
  // check if we have a match
  if (str.substring(0, lenSub).equals(sub))
  {
    n--;
    return strCopies(str.substring(1), sub, n);
  
  }
  //else
  return strCopies(str.substring(1), sub, n);
}
