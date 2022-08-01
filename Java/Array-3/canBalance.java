public boolean canBalance(int[] nums) {
  // find the total sum
  int total = 0;
  for (int num: nums)
    total += num;
  
  int totalFirst = 0;
  // find the valid index where we can split
  for (int i=0; i < nums.length; i++)
  {
    totalFirst += nums[i];
    if (totalFirst == total - totalFirst)
      return true;
  }
  return false;
}
