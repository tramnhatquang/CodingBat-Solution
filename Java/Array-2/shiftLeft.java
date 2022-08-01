public int[] shiftLeft(int[] nums) {
  int length = nums.length;
  if (length == 0)
    return new int[0];
  int[] newA = new int[length];
  newA[length - 1] = nums[0];
  for (int i = 0; i < length -1; i++)
    newA[i] = nums[i+1];
  return newA;
}

