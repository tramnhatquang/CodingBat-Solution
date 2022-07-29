public boolean array123(int[] nums) {
  int len = nums.length;
  
  for (int i = 0; i < len - 2; i++) {
    if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
      return true;    
  }
  return false;
  
}
