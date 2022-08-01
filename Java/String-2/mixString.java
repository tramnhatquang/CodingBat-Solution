public String mixString(String a, String b) {
  String res = "";
  int minLength = Math.min(a.length(), b.length());
  int i =0;
  for (; i < minLength; ++i)
  {
    res = res + a.charAt(i) + b.charAt(i);
  }
  if (a.length() < b.length())
    return res + b.substring(i);
  return res + a.substring(i);
}
