public boolean groupNoAdj(int start, int[] nums, int target) {
  // the base case
  if (start >= nums.length)
    return target == 0;
    
  // if we choose the current num at nums[start]
  if (groupNoAdj(start + 2, nums, target - nums[start]))
    return true;
    
  // if we do not choose the curr num
  return groupNoAdj(start + 1, nums, target);
  
}
