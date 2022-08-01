public int maxMirror(int[] nums) {
  int maxCount = 0;
  int len = nums.length;
  for (int i = 0; i < len; i++)
  {
    int curr_count = 0;
    for (int j = nums.length -1; j >= 0 && i + curr_count < len; j--)
    {
      if (nums[i + curr_count] == nums[j])
        curr_count++;
      else
      {
        maxCount = Math.max(maxCount, curr_count);
        curr_count = 0;
      }
    }
    maxCount = Math.max(maxCount, curr_count);
  }
  return maxCount;
}
