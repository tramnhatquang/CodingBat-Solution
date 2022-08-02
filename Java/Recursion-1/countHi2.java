public int countHi2(String str) {
  // base case
  if (str.length() <= 1)
    return 0;
    
  // the edge case when the string only has two characters and they are 'hi'
  if (str.substring(0, 2).equals("hi"))
    return 1 + countHi2(str.substring(2));
  // if the string's length > 2  
  if (str.length() > 2  && str.substring(0, 3).equals("xhi"))
    return countHi2(str.substring(3));
  return countHi2(str.substring(1));

}
