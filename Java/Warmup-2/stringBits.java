public String stringBits(String str) {
  String res = "";
  for (int i = 0; i < str.length(); i ++)
  {
    if (i % 2 == 0)
      res += str.charAt(i);
  }
  return res;
  
  
}
