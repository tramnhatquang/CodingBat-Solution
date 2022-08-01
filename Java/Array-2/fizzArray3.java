public int[] fizzArray3(int start, int end) {
  int length = end - start;
  int[] res = new int[length];
  
  for (int i = 0; i < length; i++, start++)
  {
    res[i] = start;;
  }
  return res;
}
