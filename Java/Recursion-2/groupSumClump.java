public boolean groupSumClump(int start, int[] nums, int target) {
  // the base case
  if (start >= nums.length)
    return target == 0;
    
  // use one loop to iterate all the similar adjacent values
  int i = start + 1;
  int sum = nums[start];
  while (i < nums.length && nums[start] == nums[i])
  {
    sum += nums[i];
    i++;
  }
  // if we include the current num or do not include it
  return groupSumClump(i, nums, target - sum) || groupSumClump(i, nums, target);
}
