public boolean groupSum6(int start, int[] nums, int target) {
  // the base case
  if (start >= nums.length)
    return target == 0;
    
  // we always choose
  if (nums[start] == 6)
    return groupSum6(start+1, nums, target - 6);
  
  // if current num is not 6 and we choose it
  if (groupSum6(start + 1, nums, target - nums[start]))
    return true;
  
  // if current num is not 6 and we do not choose it
  return groupSum6(start + 1, nums, target);
}
