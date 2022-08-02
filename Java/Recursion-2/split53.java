public boolean split53(int[] nums) {
  return helper(nums, 0, 0, 0);
}

public boolean helper(int[] nums, int index, int sum1, int sum2)
{
  if (index >= nums.length)
    return sum1 == sum2;
    
  int value = nums[index];
  
  // group all values that are multiple of 5 to a same group
  if (value%5 == 0)
    return helper(nums, index + 1, sum1 + value, sum2);
  // group all values that are multiple of 3 to a same group
  else if (value%3 == 0)
    return helper(nums, index + 1, sum1, sum2 + value);
  else     
    return (helper(nums, index + 1, sum1 + value, sum2) || 
      helper(nums, index + 1, sum1, sum2 + value));
  
}