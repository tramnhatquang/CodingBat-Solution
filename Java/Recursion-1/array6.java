public boolean array6(int[] nums, int index) {
  // the base case
  if (index >= nums.length)
    return false;
    
  return nums[index] == 6 || array6(nums, index + 1); 
}
