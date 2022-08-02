public List<String> noYY(List<String> strings) {
  // add "y" to the end of each string first
  strings.replaceAll(x -> x + "y");
  
  // remove all the strings that contain "yy" as a substring
  strings.removeIf(x -> x.contains("yy"));
  return strings;
}
