public Map<String, String> topping3(Map<String, String> map) {
  // if the key "potato" has a value, set that as the value for the key "fries".
  if (map.containsKey("potato"))
  {
    map.put("fries", map.get("potato"));
  }
  // if the key "salad" has a value, set that as the value for the key "spinach".
  if (map.containsKey("salad"))
  {
    map.put("spinach", map.get("salad"));
  }
  return map;
  
  
}
