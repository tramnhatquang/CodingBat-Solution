public String withoutString(String base, String remove) {
  int len = base.length();
  int lenR = remove.length();
  String res = "";
  int i = 0;
  while (i < len)
  {
    if (i < len - lenR + 1)
    {
      if (base.substring(i, i+lenR).equalsIgnoreCase(remove))
      {
        i += lenR;
        continue;
      } else
        res = res + base.charAt(i);
    } else
      res = res + base.charAt(i);
    i++;
  }
  return res;
  
  
}
