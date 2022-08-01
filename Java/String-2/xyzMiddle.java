public boolean xyzMiddle(String str) {
  int len = str.length();
  if (len < 3)
    return false;
    
  // if the length is even, and the length of all chars before "xyz" is
  // longer than length of chars after "xyz" -> 'y' is placed at len / 2 index
  // "xyz" goes from (len / 2 - 1, len / 2 - 1 + 3)
  
  // If the length is even and the second half is longer, 'z' is placed at len / 2 index
  // "xyz" goes from (len / 2 - 2, len / 2 - 2 + 3)
  
  
  // If the length is odd, the length of first half and second half is equal. Hence,
  // 'y' is always placed at len / 2. then 'xyz' goes from (len/2 - 1, len/2 -1 + 3)


  if (len % 2 == 0)
  {
    String sub1 = str.substring(len/2 - 1, len/2 -1 +3);
    String sub2 = str.substring(len/2 - 2, len/2 - 2 + 3);
    return sub1.equals("xyz") || sub2.equals("xyz");
  }
  // in the odd case
  return str.substring(len/2 - 1, len/2 -1 +3 ).equals("xyz");
  
  
}
