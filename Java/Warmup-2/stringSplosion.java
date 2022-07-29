public String stringSplosion(String str) {
  String res = "";
  int i = 0;
  while (i < str.length()) {
    res += str.substring(0, i + 1);
    i++;
  }
  return res;
}
