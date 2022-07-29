public String altPairs(String str) {
  String res = "";
  for (int i = 0; i < str.length(); i++)
  {
    if (i % 4 == 0 || i % 4 == 1)
      res += str.charAt(i);
  }
  return res;
}
