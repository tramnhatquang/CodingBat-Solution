public String notReplace(String str) {
  // use replace all
  // return str.replaceAll("\\b(is)\\b", "is not");

  // without using replace all
  int len = str.length();
  String res = "";
  int i = 0;
  while (i < len) {
    if (i > 0 && Character.isLetter(str.charAt(i - 1)) 
    || i + 2 < len && Character.isLetter(str.charAt(i + 2)))
    {
      res += str.charAt(i);
      i++;
    }  
    else if (i + 1 < len && str.substring(i, i + 2).equals("is"))
    {
      res += "is not";
      i += 2;
    }  
    else // i == 0 || i == len - 1
    {
      res += str.charAt(i);
      i++;
    }
  } 
  return res;
}
