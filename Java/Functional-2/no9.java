public List<Integer> no9(List<Integer> nums) {
  nums.removeIf(x -> x % 10 == 9);
  return nums;
}
