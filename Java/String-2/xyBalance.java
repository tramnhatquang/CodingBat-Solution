public boolean xyBalance(String str) {
  if (!str.contains("x"))
    return true;
  int lastIndexX = str.lastIndexOf("x");
  int lastIndexY = str.lastIndexOf("y");
  return lastIndexX < lastIndexY;
}
