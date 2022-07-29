public int last2(String str) {
  int length = str.length();
  if (length < 2)
    return 0;
  String last2 = str.substring(length - 2);
  
  // System.out.println(last2);
  int count = 0;  
  for (int i = 0; i < length - 2; ++i)
  {
    if (str.substring(i, i+2).equals(last2))
      count++;
  }
  return count;
}
