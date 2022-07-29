public String frontBack(String str) {
  if (str.length() <= 1 ) {
    return str;
  }
  int n = str.length();
  char firstChar = str.charAt(0);
  char lastChar = str.charAt(n - 1);
  return lastChar + str.substring(1, n - 1) + firstChar; 
}
