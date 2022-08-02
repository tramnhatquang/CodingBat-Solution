public Map<String, String> pairs(String[] strings) {
  // first way
  // Map<String, String> map = new HashMap<>();
  // for (String word: strings)
  // {
  //   String key = Character.toString(word.charAt(0));
  //   String val = Character.toString(word.charAt(word.length() - 1));
  //   map.put(key, val);
  // }
  // return map;
  
  // other way
  Map<String, String> map = new HashMap<>();
  for (String word: strings)
  {
    String key = word.substring(0, 1);
    String val = word.substring(word.length() - 1);
    map.put(key, val);
  }
  return map;
}
