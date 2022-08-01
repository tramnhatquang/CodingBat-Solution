public Map<String, String> mapBully(Map<String, String> map) {
  // check if the map contains "a" as a key
  if (map.containsKey("a"))
  {
    map.put("b", map.get("a"));
    map.put("a", "");
  }
  return map;
}
