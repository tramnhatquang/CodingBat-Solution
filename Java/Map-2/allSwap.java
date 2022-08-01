public String[] allSwap(String[] strings) {
  // stores the first char of each string as key
  // stores the index associated of each key as value
  Map<String, Integer> map = new HashMap<>();
  for (int currIndex = 0; currIndex < strings.length; currIndex++)
  {
    String key = strings[currIndex].substring(0, 1);
    if (map.containsKey(key))
    {

        // stores the val of the previous index
        String temp = strings[map.get(key)];
        
        // swapping
        strings[map.get(key)] = strings[currIndex];
        strings[currIndex] = temp;
        
        //removing the (key, val)
        map.remove(key);
    } else
      // stores (key, val) if it does not exist in the map
      map.put(key, currIndex);
  }
  return strings;
}
