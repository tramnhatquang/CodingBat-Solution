public String stringYak(String str) {
  // First approach: '.' could be any characters
  return str.replaceAll("y.k", "");
  
  
  // Second approach:
  // if (str.contains("yak"))
  //   return str.replace("yak", "");
  // return str;
}
