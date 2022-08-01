public Map<String, String> topping1(Map<String, String> map) {
  // in all cases, set the key "bread" have the value "butter"
  map.put("bread", "butter");
  
  // if the key "ice cream" is present, set its value to "cherry"
  if (map.containsKey("ice cream"))
  {
    map.put("ice cream", "cherry");
  }
  return map;
}
