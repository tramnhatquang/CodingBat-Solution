public String lastChars(String a, String b) {
  int lenA = a.length();
  int lenB = b.length();
  
  if (lenA == 0 && lenB == 0)
    return "@@";
  else if (lenA == 0)
    return "@" + b.substring(lenB - 1);
  else if (lenB == 0)
    return a.substring(0, 1) +  "@";
  return a.substring(0, 1) + b.substring(lenB - 1);
  
}
