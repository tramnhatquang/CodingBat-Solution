public int sum13(int[] nums) {
  int total = 0;
  int len = nums.length;
  // arr is empty
  if (len == 0)
    return 0;
    
  int i = 0;
  while (i < len)
  {
    if (nums[i] == 13)
      i += 2;
    else
    {
      total += nums[i];
      i++;
    }
  }
  return total;
}
