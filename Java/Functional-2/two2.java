public List<Integer> two2(List<Integer> nums) {
  // multiply each number by 2 first
  nums.replaceAll(x -> x*2);
  
  // remove any numbers that end in 2
  nums.removeIf(x -> x% 10 == 2);
  return nums;
  
}
