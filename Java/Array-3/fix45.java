public int[] fix45(int[] nums) {
  int j = 0;
  // we do not go to the last index since every 4 is followed by every 5
  // It means 4 does not appear at the last index
  for (int i = 0; i < nums.length - 1; i++)
  {
    if (nums[i] == 4 && nums[i + 1] != 5)
    {
      // searching from the start of the arr, only move 5 that is not after 4
      while (nums[j] != 5 || j != 0 && nums[j - 1] == 4)
        j++;
      nums[j] = nums[i + 1];
      nums[i + 1] = 5;
    }
  }
  return nums;
}
