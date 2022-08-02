public boolean groupSum(int start, int[] nums, int target) {
  // the base case
  if (start >= nums.length)
    return target == 0;
    
  // if we choose the nums[start]
  if (groupSum(start + 1, nums, target - nums[start]))
    return true;
  
  // if we not choose the nums[start]
  if (groupSum(start + 1, nums, target))  
    return true;
  // if neither work, it's not possible
  return false;
}
