public int[] fix34(int[] nums) {
  // The outer loop finds 3
  // we do not go to the last index, since 3 does not appear at that index
  // and we need to rearrange every 4 after every 3
  for (int i =0; i < nums.length - 1; i++)
  {
    if (nums[i] == 3)
    {
      // the inner loop finds 4
      for (int j = 1; j < nums.length; j++)
      {
        if (nums[j] == 4 && nums[j - 1] != 3)
        {
          nums[j] = nums[i + 1];
          nums[i + 1] = 4;
          break;
        }
      }
    }
  }
  return nums;
}
