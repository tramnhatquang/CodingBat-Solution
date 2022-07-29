public String withoutX2(String str) {
  int len = str.length();
  
  if (len == 0)
    return "";
  else if (len == 1) {
    if (str.charAt(0) == 'x')
      return "";
    return str;
  } else {
    if (str.substring(0, 2).equals("xx"))
      return str.substring(2);
    else if (str.charAt(0) == 'x')
      return str.substring(1);
    else if (str.charAt(1) == 'x')
      return str.charAt(0) + str.substring(2);
    return str;
    
  }
  
}
