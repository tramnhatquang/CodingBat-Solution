public String comboString(String a, String b) {
  int lenA = a.length();
  int lenB = b.length();
  if (lenA < lenB)
    return a + b + a;
  return b + a + b;
}
