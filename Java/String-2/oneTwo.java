public String oneTwo(String str) {
  int len = str.length();
  if (len < 3)
    return "";
    
  String res = "";
  for (int i = 0; i < len - 2; i+=3)
  {
    res += str.substring(i + 1, i + 3) + str.charAt(i);
  }
  return res;
}
