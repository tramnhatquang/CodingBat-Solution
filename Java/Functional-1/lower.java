public List<String> lower(List<String> strings) {
  strings.replaceAll(x -> x.toLowerCase());
  return strings;
}
