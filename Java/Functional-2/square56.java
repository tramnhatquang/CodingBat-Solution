public List<Integer> square56(List<Integer> nums) {
  // return a list of those numbers squared and the product added to 10
  nums.replaceAll(x -> x*x + 10);
  
  //omitting any of the resulting numbers that end in 5 or 6.
  nums.removeIf(x -> x % 10 == 5 || x% 10 == 6);
  return nums;
  
}
