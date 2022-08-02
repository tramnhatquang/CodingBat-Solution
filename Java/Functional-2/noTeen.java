public List<Integer> noTeen(List<Integer> nums) {
  nums.removeIf(x -> (x >= 13 && x <= 19));
  return nums;
}
