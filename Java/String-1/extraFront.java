public String extraFront(String str) {
  int len = str.length();
  String front;
  if (len < 2)
    front = str;
  else
    front = str.substring(0, 2);
  return front + front + front;
}
