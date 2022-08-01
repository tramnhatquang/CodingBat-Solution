public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<>();
  for (String w: strings)
  {
    // get the first char as a key
    String key = w.substring(0, 1);
    if (map.containsKey(key))
    {
      map.put(key, map.get(key) + w);
    } else
      map.put(key, w);
  }
  return map;
}
