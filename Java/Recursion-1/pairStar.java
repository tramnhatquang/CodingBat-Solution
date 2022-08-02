public String pairStar(String str) {
  // the base case
  if (str.length() <= 1)
    return str;
    
  // check two adjacent chars
  if (str.charAt(0) == str.charAt(1))
    return str.charAt(0) + "*" + pairStar(str.substring(1));
  
  // if not 
  return str.charAt(0) + pairStar(str.substring(1));
}
