public boolean equalIsNot(String str) {
  int count_is = 0, count_not =0;
  
  // TWO SEPARATE LOOPS
  // count the number of occurrences of "is"
  // int len = str.length();
  // for (int i= 0; i < len - 2 + 1; i++)
  // {
  //   if (str.substring(i, i+2).equals("is"))
  //     count_is++;
  // }
  
  // // count the number of occurrences of "not"
  // for (int i= 0; i < len - 3 + 1; i++)
  // {
  //   if (str.substring(i, i+3).equals("not"))
  //     count_not++;
  // }
  
  // return count_is == count_not;
  
  // ONLY ONE LOOP
  int len = str.length();
  for (int i= 0;  i < len; i++)
  {
    if (i < len - 1 && str.substring(i, i+2).equals("is"))
      count_is++;
    else if (i < len - 2 && str.substring(i, i+3).equals("not"))
      count_not++;
  }
  return count_is == count_not;
  
}
