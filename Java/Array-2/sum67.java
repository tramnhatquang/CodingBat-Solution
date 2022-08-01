public int sum67(int[] nums) {
  int len = nums.length;
  int total =0, i = 0;
  while (i < len)
  {
    if (nums[i] == 6)
    {
      while (nums[i] != 7)
        i++;
      // at this point, we are at the 7
      // increasment by 1 to the next number
      i++;
    } else
    {
      total += nums[i];
      i++;
    }
    
  }
  return total;
}
