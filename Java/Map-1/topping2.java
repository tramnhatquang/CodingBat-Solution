public Map<String, String> topping2(Map<String, String> map) {
  // if the key "ice cream" has a value, set that as the value for the key "yogurt" also
  if (map.containsKey("ice cream"))
  {
    map.put("yogurt", map.get("ice cream"));
  }
  
  //If the key "spinach" has a value, change that value to "nuts".
  if (map.containsKey("spinach"))
  {
    map.put("spinach", "nuts");
  }
  return map;
}
