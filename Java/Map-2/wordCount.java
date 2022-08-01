public Map<String, Integer> wordCount(String[] strings) {
  // Map<String, Integer> map = new HashMap<>();
  // for (String word: strings)
  // {
  //   if (map.containsKey(word))
  //   {
  //     map.put(word, map.get(word) + 1);
  //   } else
  //     map.put(word, 1);
  // }
  // return map;
  
  Map<String, Integer> map =new HashMap<>();
  for (String word: strings)
  {
    map.put(word, map.getOrDefault(word, 0) + 1);
  }
  return map;
}
