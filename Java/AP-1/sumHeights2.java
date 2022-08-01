public int sumHeights2(int[] heights, int start, int end) {
  int change = 0;
  for (int i = start; i < end; ++i)
  {
    if (heights[i] < heights[i + 1])
      change += 2 * (heights[i + 1] - heights[i]);
    else
      change += heights[i] - heights[i+1];
  }
  return change;
}
