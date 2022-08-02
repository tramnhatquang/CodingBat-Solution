public String stringClean(String str) {
  // base case
  if (str.length() <= 1)
    return str;
    
  // check adjacent chars
  if (str.charAt(0) == str.charAt(1))
    return stringClean(str.substring(1));
  
  // if not
  return str.charAt(0) + stringClean(str.substring(1));
} 
