public int stringMatch(String a, String b) {
  // find which string is shorter in length
  int len = Math.min(a.length(), b.length());
  int count = 0;
  
  for (int i = 0; i < len - 1; i++)
  {
    if (a.substring(i, i+2).equals(b.substring(i,i+2)))
      count++;
  }
  return count;
  
}
