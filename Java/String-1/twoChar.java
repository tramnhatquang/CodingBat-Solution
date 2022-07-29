public String twoChar(String str, int index) {
  if (index > 0 && index + 1 < str.length())
    return str.substring(index, index + 2);
  return str.substring(0, 2);
}
