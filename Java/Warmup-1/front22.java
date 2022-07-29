public String front22(String str) {
  int n = str.length();
  String front;
  if (n < 2)
    front = str;
  else
    front = str.substring(0, 2);
  return front + str + front;
}
