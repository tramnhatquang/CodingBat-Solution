boolean doubleX(String str) {
  int firstXIndex = str.indexOf("x");
  return str.indexOf("x", firstXIndex + 1) == firstXIndex + 1;
}
