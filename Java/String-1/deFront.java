public String deFront(String str) {    
  String res = "";
  int len = str.length();
  
  for (int i = 0; i < len; ++i)
  {
    if ( i == 0 && str.charAt(0) == 'a')
      res += 'a';
    else if (i == 1 && str.charAt(1) == 'b')
      res += 'b';
    else if (i >= 2)
      res += str.charAt(i);
  }
  return res;
}
