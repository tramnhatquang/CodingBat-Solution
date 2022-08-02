public List<String> noZ(List<String> strings) {
  strings.removeIf(x -> x.contains("z"));
  return strings;
}
