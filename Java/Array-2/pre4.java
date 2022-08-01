public int[] pre4(int[] nums) {
  int len = 0;
  for (int i = 0; i < nums.length; i++)
  {
    if (nums[i] == 4)
    {
      len = i;
      break;
    }

  }
  int[] newA = new int[len];
  for (int i = 0; i < len ; i++)
    newA[i] = nums[i];
  return newA;
}
