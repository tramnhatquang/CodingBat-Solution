public String lastTwo(String str) {
  int len = str.length();
  if (len < 2)
    return str;
  String lastChar = Character.toString(str.charAt(len - 1));
  String secondLastChar = Character.toString(str.charAt(len - 2));
  
  return str.substring(0, len - 2) + lastChar + secondLastChar;
}
