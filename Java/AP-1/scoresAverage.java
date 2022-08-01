public int scoresAverage(int[] scores) {
  int len = scores.length;
  int firstHalf = average(scores, 0, len / 2);
  int secondHalf = average(scores, len / 2, len);
  if (firstHalf < secondHalf)
    return secondHalf;
  return firstHalf;
}


public int average(int[] scores, int start, int end) {
  int sum = 0;
  for (int i = start; i < end; i++)
  {
    sum += scores[i];
  }
  return  (int) (sum / (end - start));
}