public Map<String, Boolean> wordMultiple(String[] strings) {
  // use two maps
  // Map<String, Integer> map1 = new HashMap<>();
  // Map<String, Boolean> map2 = new HashMap<>();
  // for (String w: strings)
  // {
  //   map1.put(w, map1.getOrDefault(w, 0) + 1);
  //   if (map1.get(w) >= 2)
  //     map2.put(w, true);
  //   else
  //     map2.put(w, false);
  // }
  // return map2;
  
  
  // use only one map
  Map<String, Boolean> map = new HashMap<>();
  for (String w: strings)
  {
    // stores false = seen it once
    // stores true = seen it twice or more
    if (map.containsKey(w))
    {
      map.put(w, true);
    } else
      map.put(w, false);
    
  }
  return map;
}
