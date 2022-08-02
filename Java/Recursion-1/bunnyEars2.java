public int bunnyEars2(int bunnies) {
  // the base case
  if (bunnies == 0)
    return 0;
  
  // if bunnies'ears are odd
  if (bunnies  %  2 == 1)
    return 2 + bunnyEars2(bunnies - 1);
  // if they are even
  return 3 + bunnyEars2(bunnies - 1);
}
