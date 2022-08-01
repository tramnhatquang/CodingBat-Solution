public int[] copyEvens(int[] nums, int count) {
  
  // initialize a new arr
  int[] arr = new int[count];
  int j = 0;
  for (int num: nums)
  {
    if (num % 2 == 0 && j < count)
    {
      arr[j++] = num;
    }
  }
  return arr;
}
