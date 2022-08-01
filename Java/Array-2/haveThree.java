  public boolean haveThree(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++)
    {
      if (nums[i] == 3 && nums[i + 1] == 3)
        return false;
      if (nums[i] == 3)
        count++;
    }
    // check if the last element is a 3
    if (nums.length > 1 && nums[nums.length - 1] == 3)
      count++;
    return count == 3;
  }
