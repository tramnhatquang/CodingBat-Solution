public String getSandwich(String str) {
  // get the first index of "bread"
  int index = str.indexOf("bread");
  // get the last index of "bread"
  int lastIndex = str.lastIndexOf("bread");
  if (index == lastIndex) // either -1 or points to the same index
    return "";
  return str.substring(index+5, lastIndex);
}
