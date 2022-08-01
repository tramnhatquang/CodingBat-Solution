public boolean no14(int[] nums) {
  boolean contains_one = false;
  boolean contains_four = false;
  for (int i = 0; i < nums.length; ++i)
  {
    if (nums[i] == 1)
      contains_one = true;
    else if (nums[i] == 4)
      contains_four = true;
  }
  return !(contains_one && contains_four);
}
