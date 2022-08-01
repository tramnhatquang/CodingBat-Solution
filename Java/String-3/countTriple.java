public int countTriple(String str) {
  int count = 0;
  for (int i = 0; i < str.length() - 2; i++)
  {
    char chr = str.charAt(i);
    if (chr == str.charAt(i + 1) && chr == str.charAt(i + 2))
      count++;
  }
  return count;
}
