public String wordEnds(String str, String word) {
  int len = str.length();
  int lenW = word.length();
  
  String res = "";
  for (int i = 0; i < len - lenW + 1; ++i)
  {
    if (i > 0 && str.substring(i, i+lenW).equals(word))
      res = res + str.charAt(i - 1);
    if ( i + lenW < len && str.substring(i, i + lenW).equals(word))
      res = res + str.charAt(i+lenW);
  }
  return res;
}
