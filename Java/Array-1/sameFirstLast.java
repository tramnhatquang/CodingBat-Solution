public boolean sameFirstLast(int[] nums) {
  int len = nums.length;
  if (len == 0)
    return false;
    
  return nums[0] == nums[len - 1];
}
