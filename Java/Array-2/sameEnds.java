public boolean sameEnds(int[] nums, int len) {
  for (int i =0, j = nums.length - len; i < len;i++, j++)
  { 
    // j is the start of the N numbers at the end of the arr
    // i is the start of the N numvers at the start of arr
    if (nums[i] !=  nums[j])
      return false;
  }
  return true;
}
