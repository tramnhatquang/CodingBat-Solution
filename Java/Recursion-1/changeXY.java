public String changeXY(String str) {
  // base case
  if (str.length() == 0)
    return str;
  
  // if the first char of each recursive call is a 'x'  
  if (str.charAt(0) == 'x')
    return 'y' + changeXY(str.substring(1));
    
  // else
  return str.charAt(0) + changeXY(str.substring(1));
}
