public int strCount(String str, String sub) {
  // base case
  if (str.length() < sub.length())
    return 0;
  int lenSub = sub.length();
  
  // if we have a match
  if (str.substring(0, lenSub).equals(sub))
    return 1 + strCount(str.substring(lenSub), sub);
  
  //else 
  return strCount(str.substring(1), sub);
}
