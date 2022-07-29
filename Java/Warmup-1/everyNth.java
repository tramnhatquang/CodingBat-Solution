public String everyNth(String str, int n) {
  String ans = "";
  // look at every nth char
  for (int i = 0; i < str.length(); i += n)
  {
    ans += str.charAt(i);
  }
  return ans;
}
