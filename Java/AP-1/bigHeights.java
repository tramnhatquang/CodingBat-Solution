public int bigHeights(int[] heights, int start, int end) {
  int count = 0;
  for (int i = start; i < end; i++)
  {
    int change = Math.abs(heights[i] - heights[i+1]);
    if (change >= 5)
      count++;
  }
  return count;
}
