public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  String res = "";
  for (String w: strings )
  {
    map.put(w, map.getOrDefault(w, 0) + 1);
    if (map.get(w) % 2 == 0)
      res += w;
  }
  return res;
  
}
