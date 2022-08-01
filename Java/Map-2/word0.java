public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  for (String word: strings)
  {
    map.put(word, 0);
  }
  return map;
}
