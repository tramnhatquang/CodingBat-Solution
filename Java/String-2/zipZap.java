public String zipZap(String str) {
  int len = str.length();
  if (len < 3)
    return str;
  
  String res = "";
  for (int i = 0; i < len; i++)
  {
    if (str.charAt(i) == 'z' && i + 2 < len && str.charAt(i + 2) == 'p')
    {
      res += "zp";
      i += 2;
    }
    else
      res = res + str.charAt(i);
  }
  
  return res;
}
