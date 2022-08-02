public int countAbc(String str) {
  // base case
  if (str.length() <= 2)
    return 0;
  
  if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba"))
    return 1 + countAbc(str.substring(1));
  return countAbc(str.substring(1));
}
