public String stringX(String str) {
  int len = str.length();
  if (len <= 2)
    return str;
  char start = str.charAt(0);
  char end = str.charAt(len - 1);
  str = str.substring(1, len - 1).replace("x", "");
  return start + str + end;
  
}
