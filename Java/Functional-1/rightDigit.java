public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(x -> x% 10);
  return nums;
}
