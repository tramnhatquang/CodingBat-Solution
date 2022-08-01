public int sumHeights(int[] heights, int start, int end) {
  int change = 0;
  for (int i = start; i < end; ++i)
  {
    change += Math.abs(heights[i] - heights[i + 1]);
  }
  return change;
}
