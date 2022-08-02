public int countX(String str) {
  // base case
  if (str.length() == 0)
    return 0;
  // check the first char
  if (str.charAt(0) == 'x')
    return 1 + countX(str.substring(1));
  // else
  return countX(str.substring(1));
}
