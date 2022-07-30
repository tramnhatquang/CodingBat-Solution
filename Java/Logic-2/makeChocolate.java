public int makeChocolate(int small, int big, int goal) {
  // check if we can use all big and small bags to fulfill the goal
  if (goal > big * 5 + small)
    return -1;
  int remainder;
  if (goal >= 5 * big)
    remainder = goal - 5*big;
  else
    remainder = goal % 5;
    
  return remainder <= small? remainder: -1;
}
