public int[] tenRun(int[] nums) {
  for (int i = 0; i < nums.length - 1; ++i)
  {
    if (nums[i] % 10 == 0 && nums[i + 1] % 10 != 0)
      nums[i + 1] = nums[i];
  }
  return nums;
}
