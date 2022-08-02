public int countHi(String str) {
  // the base case
  if (str.length() < 2)
    return 0;
    
  // if we find a "hi"
  if (str.substring(0, 2).equals("hi"))
    return 1 + countHi(str.substring(2));
    
  // else
  return countHi(str.substring(1));
}
