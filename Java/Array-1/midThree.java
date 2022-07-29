public int[] midThree(int[] nums) {
  int len = nums.length;
  int[] newA = new int[3];
  newA[0] = nums[len/2 - 1];
  newA[1] = nums[len/2];
  newA[2] = nums[len/2 + 1];
  return newA;
}
