public int strDist(String str, String sub) {
  // base case
  if (str.length() < sub.length())
    return 0;
  
  int lenSub = sub.length();  
  // check if the substring starts with sub
  if (str.substring(0, lenSub).equals(sub))
  {
    if (str.substring(str.length() - lenSub).equals(sub))
      return str.length();
    else
      // find the substring whose last char is equal to sub 
      return strDist(str.substring(0, str.length() - 1), sub);
  }
  return strDist(str.substring(1), sub);
}
