public boolean has12(int[] nums) {
  int index_one = -1;
  int index_two = -1;
  for (int i = 0 ; i< nums.length; ++i)
  {
    if (nums[i] == 1)
      index_one = i;
    else if (nums[i] == 2)
      index_two = i;
  }
  if (index_one == -1 || index_two == -1)
    return false;
  return index_one < index_two;
}
