public int[] copyEndy(int[] nums, int count) {
  int i = 0;
  int[] arr = new int[count];
  for (int num: nums)
  {
    if (i >= count)
      break;
    if (isEndy(num))
      arr[i++] = num;
  }
  return arr;
}



public boolean isEndy(int n)
{
  return (0 <= n && n <= 10) || (90 <= n && n <= 100);
}