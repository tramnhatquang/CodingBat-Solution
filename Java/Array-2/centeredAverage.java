public int centeredAverage(int[] nums) {
  int len = nums.length;
  int max = nums[0];
  int min = nums[0];
  int total = nums[0];
  // find the min, max of the arr
  for (int i = 1; i < len; i++)
  {
    total += nums[i];
    max = Math.max(max, nums[i]);
    min = Math.min(min, nums[i]);
  }
  return (total - min - max) / (len - 2);
}
