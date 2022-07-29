public String frontTimes(String str, int n) {
  int length = str.length();
  String front, res = "";
  if (length < 3)
    front = str;
  else
    front = str.substring(0, 3);
  while (n-- > 0)
  {
    res += front;
  }
  return res;
}
