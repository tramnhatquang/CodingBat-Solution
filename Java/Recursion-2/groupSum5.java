public boolean groupSum5(int start, int[] nums, int target) {
  // base case
  if (start >= nums.length)
    return target == 0;
  
  // the current num is a multiply of 5  
  if (nums[start] % 5 == 0)
  {
    if (start + 1 < nums.length && nums[start + 1]  == 1)
      return groupSum5(start + 2, nums, target - nums[start]);
    return groupSum5(start + 1, nums, target - nums[start]);
  }

  
  // if it is not, and we include the current number
  if (groupSum5(start + 1, nums, target - nums[start]))
    return true;
    
  // we do not include the curr num
  return groupSum5(start + 1, nums, target);
}
