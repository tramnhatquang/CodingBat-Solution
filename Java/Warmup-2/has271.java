public boolean has271(int[] nums) {
  int len = nums.length;
  // there are less than 3 elements
  if (len < 3)
    return false;
    
  // loop over the array
  for (int i = 0; i < len - 2; i++)
  {
    int first = nums[i];
    int second = nums[i+1];
    int third = nums[i+2];
    if (second == first + 5)
    {
      if (Math.abs(third - (first - 1)) <= 2)
        return true;
    }
  }
  return false;
    
    
}
