public String repeatSeparator(String word, String sep, int count) {
  String res = word;
  if (count == 0)
    return "";
  while (count > 1)
  {
    res += sep + word;
    count--;
  }
  return res;
}
