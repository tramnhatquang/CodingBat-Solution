public int maxTriple(int[] nums) {
  int len = nums.length;
  if (len == 1)
    return nums[0];
  return Math.max(nums[0], Math.max(nums[len - 1], nums[len / 2]));
}
