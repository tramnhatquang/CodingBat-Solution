public String parenBit(String str) {
  // the base case
  if (str.length() == 0)
    return str;
    
  // check the first char
  if (str.charAt(0) == '(')
  {
    if (str.charAt(str.length() - 1) == ')')
      return str;
    else
      // shrinking the last char from the end
      return parenBit(str.substring(0, str.length() -1));
  } // shrinking the first char from thr start
  return parenBit(str.substring(1));
  
     
}
