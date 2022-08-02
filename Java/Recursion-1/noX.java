public String noX(String str) {
  // base case
  if (str.length() == 0)
    return str;
    
  // remove 'x' if find at the front
  if (str.charAt(0) == 'x')
    return noX(str.substring(1));
  
  // if not find
  return str.charAt(0) + noX(str.substring(1));
}
