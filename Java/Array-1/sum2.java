public int sum2(int[] nums) {
  int len = nums.length;
  int sum = 0;
  if (len == 0) return 0;
  else if (len == 1) return nums[0];
  return nums[0] + nums[1];
}
