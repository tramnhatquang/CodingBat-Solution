public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  for (String word: strings)
  { 
    map.put(word, word.length());
  }
  return map;
}
