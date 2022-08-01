public boolean gHappy(String str) {
  int len = str.length();
  if (len == 1) // always false
    return false;
  for (int i = 0; i < len; ++i)
  {
    if (str.charAt(i) == 'g')
    {
      if (i + 1 < len && str.charAt(i + 1) == 'g')
        continue;
      else if (i > 0 && str.charAt(i - 1) == 'g')
        continue;
      return false;
    }
  }
  return true;
}
