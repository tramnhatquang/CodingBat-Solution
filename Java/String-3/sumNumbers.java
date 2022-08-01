public int sumNumbers(String str) {
  int total = 0;
  String curr_num = "";
  int  len = str.length();
  
  for (int i = 0; i < len; ++i)
  {
    char chr = str.charAt(i);
    if (Character.isDigit(chr))
    {
      if (i + 1 < len && Character.isDigit(str.charAt(i + 1)))
        curr_num += str.charAt(i);
      else
      {
        curr_num += str.charAt(i);
        total += Integer.parseInt(curr_num);
        curr_num = "";
      }
    }
  }
  return total;
}
