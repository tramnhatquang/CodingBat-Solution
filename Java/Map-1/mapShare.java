public Map<String, String> mapShare(Map<String, String> map) {
  // remove key "c"
  map.remove("c");
  if (map.containsKey("a"))
  {
    map.put("b", map.get("a"));
  }
  return map;
}
