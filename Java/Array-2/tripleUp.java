public boolean tripleUp(int[] nums) {
  for (int i= 1 ; i < nums.length - 1; i++)
  {
    if (nums[i - 1] + 1 == nums[i] && nums[i] + 1 == nums[i+1])
      return true;
  }
  return false;
}
