public String front3(String str) {
  int n = str.length();
  String front;
  if (n < 3)
    front = str;
  else 
    front = str.substring(0, 3);
    
  return front + front + front;
    
}
