public int count11(String str) {
  // base case
  if (str.length() <= 1)
    return 0;
    
  // check the substring '11'
  if (str.substring(0, 2).equals("11"))
    return 1 + count11(str.substring(2));
  return count11(str.substring(1));
}
