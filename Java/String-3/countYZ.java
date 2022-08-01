public int countYZ(String str) {
  int count = 0;
  str = str.toLowerCase();
  int len = str.length();
  for (int i = 0; i < len; ++i)
  {
    if (str.charAt(i) == 'y' || str.charAt(i) == 'z'){
      // at the end of the string
      if (i == len - 1)
        count++;
      else if (i + 1 < len && !Character.isLetter(str.charAt(i + 1)))
        count++;
    }
  }
  return count;
  
}
