public int[] makeLast(int[] nums) {
  int len = nums.length;
  int[] newA = new int[len* 2];
  newA[len*2 - 1] = nums[len - 1];
  return newA;
}
