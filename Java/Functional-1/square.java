public List<Integer> square(List<Integer> nums) {
  nums.replaceAll(x -> x*x);
  return nums;
}
