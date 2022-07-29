public int[] maxEnd3(int[] nums) {
  int max = Math.max(nums[0], nums[nums.length - 1]);
  return new int[] {max, max, max};
}
