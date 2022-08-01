public String repeatFront(String str, int n) {
  String res = "";
  while (n > 0) {
    res += str.substring(0, n);
    n--;
  }
  return res;
}
