public boolean sum28(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++)
  {
    if (nums[i] == 2)
      count++;
  }
  return count * 2 == 8;
}
