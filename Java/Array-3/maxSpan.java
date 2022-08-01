public int maxSpan(int[] nums) {
  if (nums.length == 0)
    return 0;
  int maxSpan = 1; // the least span
  
  for (int i = 0; i < nums.length; i++)
  {
    int lastPointer = nums.length - 1;
    while (nums[i] != nums[lastPointer])
      lastPointer--;
      
    maxSpan = Math.max(maxSpan, lastPointer - i + 1);
  }
  return maxSpan;
  
  
}