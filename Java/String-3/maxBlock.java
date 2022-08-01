public int maxBlock(String str) {
  if (str.length() == 0)
    return 0;
  int max = 0, count = 1;
  for (int i = 0;  i < str.length() - 1; i++)
  {
    if (str.charAt(i) == str.charAt(i + 1))
      count++;
    else{
      max = Math.max(max, count);
      count = 1;
    }
  }
  return Math.max(max, count);
}
