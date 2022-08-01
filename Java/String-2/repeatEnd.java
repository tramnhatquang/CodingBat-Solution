public String repeatEnd(String str, int n) {
  int len = str.length();
  String sub = str.substring(len - n);
  String res = "";
  for (int i = 0; i < n; i++)
  {
    res += sub;
  }
  return res;
}
