public boolean either24(int[] nums) {
  boolean contains_22 = false;
  boolean contains_44 = false;
  for (int i = 0; i < nums.length - 1; i++)
  {
    if (nums[i] == 2 && nums[i + 1] == 2)
      contains_22 = true;
    else if (nums[i] == 4 && nums[i+1] == 4)
      contains_44 = true;
  }
  return (contains_22 && !contains_44) || (!contains_22 && contains_44);
}
