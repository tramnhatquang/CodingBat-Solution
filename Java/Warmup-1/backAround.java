public String backAround(String str) {
  int n = str.length();
  char lastChar = str.charAt(n - 1);
  return lastChar + str + lastChar;
}
