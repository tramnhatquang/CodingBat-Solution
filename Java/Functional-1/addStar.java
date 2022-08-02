public List<String> addStar(List<String> strings) {
  strings.replaceAll(x -> x + "*");
  return strings;
}
