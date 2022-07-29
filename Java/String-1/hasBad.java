public boolean hasBad(String str) {
  int len = str.length();
  
  if (len < 3)
    return false;
  else if (len >= 3 && str.substring(0,3).equals("bad"))
    return true;
  else if (len >= 4 && str.substring(1, 4).equals("bad"))
    return true;
  return false;
  
}
