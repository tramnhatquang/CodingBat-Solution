public int scoreUp(String[] key, String[] answers) {
  int count = 0;
  int len = key.length;
  
  for (int i = 0; i < len; ++i)
  {
    if (key[i].equals(answers[i]))
      count += 4;
    else if (answers[i].equals("?"))
      continue;
    else
      count -= 1;
  }
  return count;
}
