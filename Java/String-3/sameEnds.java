public String sameEnds(String str) {
  int len = str.length();
  String res = "";
  for (int i = 1;  i <= len / 2; i++)
  {
    if (str.substring(0, i).equals(str.substring(len - i)))
      res = str.substring(0, i);
  }
  return res;
  
}
