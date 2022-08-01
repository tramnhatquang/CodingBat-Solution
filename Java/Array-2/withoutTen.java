public int[] withoutTen(int[] nums) {
  int[] arr = new int[nums.length];
  int i = 0;
  for (int j = 0 ; j < nums.length; j++)
  {
    if (nums[j] != 10)
      arr[i++] = nums[j];
  }
  return arr;
}
