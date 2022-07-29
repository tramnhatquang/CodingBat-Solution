public String left2(String str) {
  int len = str.length();
  
  String first2 = str.substring(0, 2);
  return str.substring(2) + first2;
}
