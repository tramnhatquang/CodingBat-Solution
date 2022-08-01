public String[] firstSwap(String[] strings) {
  // stores the first char of each string as key
  // stores the index associated of each key as value
  Map<String, Integer> map = new HashMap<>();
  for (int currIndex = 0; currIndex < strings.length; currIndex++)
  {
    String key = strings[currIndex].substring(0, 1);
    if (map.containsKey(key))
    {   
        // if the val is -1, the key is already used, move on to the next char
        if (map.get(key) == -1)
          continue;
        // stores the val of the previous index
        String temp = strings[map.get(key)];
        
        // swapping
        strings[map.get(key)] = strings[currIndex];
        strings[currIndex] = temp;
        
        // put -1 as value so that you cannot use it later
        map.put(key, -1);
    } else
    {
      // stores (key, val) if it does not exist in the map
      map.put(key, currIndex);
    }

  }
  return strings;
}
