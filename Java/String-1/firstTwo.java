public String firstTwo(String str) {
  int len = str.length();
  
  if (len < 2)
    return str;
    
  return str.substring(0, 2);
}
