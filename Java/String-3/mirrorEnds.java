public String mirrorEnds(String string) {
  // Check forward and backward character
  String res = "";
  for (int i = 0; i< string.length(); ++i )
  {
    if (string.charAt(i) == string.charAt(string.length() - i - 1))
      res += string.charAt(i);
    else
      break;
  }
  return res;
  
}
