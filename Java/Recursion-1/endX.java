public String endX(String str) {
  // base case
  if (str.length() <= 1)
    return str;
  
  // check the first char of each string to see if we have a matach of 'x'
  if (str.charAt(0) == 'x')
    return endX(str.substring(1)) + "x";
  
  // else
  return str.charAt(0) + endX(str.substring(1));
  
  
  
  
}
