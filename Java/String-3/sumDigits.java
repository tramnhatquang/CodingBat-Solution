public int sumDigits(String str) {
  int total = 0;
  for (int i = 0; i < str.length(); i++) {
    char chr = str.charAt(i);
    if (Character.isDigit(chr))
      total += Integer.parseInt(str.substring(i, i+1));
  }
  return total;
}
