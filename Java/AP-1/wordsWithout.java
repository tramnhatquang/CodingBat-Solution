public String[] wordsWithout(String[] words, String target) {
  // count the occurrences of the target string
  int count = 0;
  
  for (String word: words)
  {
    if (word.equals(target))  
      count++;
  }
  
  // initialize a new arr
  String[]  arr = new String[words.length - count];
  int i = 0;
  for (String word: words)
  {
    if (!word.equals(target))
      arr[i++] = word;
  }
  return arr;
}
