public boolean nestParen(String str) {
  // base case, empty string is  valid 
  if (str.length() == 0)
    return true;
  // check the first and last parenthesis
  if (str.charAt(0) == '(' && str.charAt(str.length() -1) == ')')
    return nestParen(str.substring(1, str.length() - 1));
  
  // else, we have a mismatch "(("" or "))", ")("
  return false;
}
