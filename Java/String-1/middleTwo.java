public String middleTwo(String str) {
  int len = str.length();
  String second = Character.toString(str.charAt(len / 2));
  String first = Character.toString(str.charAt(len / 2 - 1));
  return first + second;
  
}
