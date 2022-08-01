public Map<String, String> mapAB4(Map<String, String> map) {
  // we check if we have both a and b in the map
  if (map.containsKey("a") && map.containsKey("b"))
  {
    int lenA = map.get("a").length();
    int lenB = map.get("b").length();
    
    if (lenA < lenB)
      map.put("c", map.get("b"));
    else if (lenA > lenB)
      map.put("c", map.get("a"));
    else 
    {
      map.put("a", "");
      map.put("b", "");
    }
  }

  return map;
}
