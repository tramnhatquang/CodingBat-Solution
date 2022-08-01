public int countClumps(int[] nums) {
  int count = 0;
  boolean match = false;
  for (int i = 0; i < nums.length - 1; i++)
  {
    if (nums[i] == nums[i + 1] && !match)
    {
      count++;
      match = true;
    } else if (nums[i] != nums[i + 1])
      match = false;
  }
  return count;
}
