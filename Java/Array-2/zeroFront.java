public int[] zeroFront(int[] nums) {
  int insertIndex = 0;
  for (int i = 0; i < nums.length; i++)
  {
    if (nums[i] == 0)
    {
      // swap
      int temp = nums[insertIndex];
      nums[insertIndex] = nums[i];
      nums[i] = temp;
      insertIndex++;
    }
  }
  return nums;
}
