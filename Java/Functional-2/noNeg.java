public List<Integer> noNeg(List<Integer> nums) {
  nums.removeIf(x -> x < 0);
  return nums;
}
