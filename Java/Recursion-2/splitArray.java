public boolean splitArray(int[] nums) {
  return is_valid(0, nums, 0, 0);
}

// use a helper method to split up the sum
public boolean is_valid(int index, int[] nums, int sum1, int sum2)
{
  if (index >= nums.length)
    return sum1 == sum2;
    
  return is_valid(index + 1, nums, sum1 + nums[index], sum2) ||
        is_valid(index + 1, nums, sum1, sum2 + nums[index]);
}