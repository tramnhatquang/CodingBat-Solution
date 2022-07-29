public String without2(String str) {
  int len = str.length();
  if (len == 2 || len == 0)
    return "";
  else if (len == 1)
    return str;
  
  if (str.substring(0, 2).equals(str.substring(len - 2)))
    return str.substring(2);
  return str;
}
