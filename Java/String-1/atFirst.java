public String atFirst(String str) {
  int len = str.length();
  if (len == 1)
    return str + "@";
  else if (len == 0)
    return "@" + "@";
  return str.substring(0, 2);
}
