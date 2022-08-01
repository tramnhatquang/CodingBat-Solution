public int[] evenOdd(int[] nums) {
  // use a new arr
  // int[] arr = new int[nums.length];
  // int j = 0;
  // for (int i = 0; i < nums.length; i++)
  // {
  //   if (nums[i] % 2 == 0)
  //     arr[j++] = nums[i];
  // }
  // for (int i = 0; i < nums.length; i++)
  // {
  //   if (nums[i] % 2 != 0)
  //     arr[j++] = nums[i];
  // }
  // return arr;
  
  
  // modify in-place
  int insertIndex = 0;
  for (int i = 0; i < nums.length; i++)
  {
    if (nums[i] % 2 == 0)
    {
      // swapping
      int temp = nums[insertIndex];
      nums[insertIndex] = nums[i];
      nums[i] = temp;
      insertIndex++;
    }
  }
  return nums;
  
  
  
  
  
  
  
  
  
}
