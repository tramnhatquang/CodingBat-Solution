public int[] post4(int[] nums) {
  // find the last index of 4 in the arr
  int index = nums.length - 1;
  while (nums[index] != 4)
    index--;
    
  // initialize a new arr whose length = nums.length - index - 1
  int[] newA = new int[nums.length - index - 1];
  for (int i = 0; i < newA.length; i++)
  {
    newA[i] = nums[index + i + 1];
  }
  return newA;
}
