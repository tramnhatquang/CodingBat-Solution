public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> arr = new ArrayList<>();
  for (String word: words)
  {
    if (word.length() != len)
        arr.add(word);
  }
  return arr;
}
