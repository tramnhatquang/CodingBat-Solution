public List<String> noLong(List<String> strings) {
  strings.removeIf(x -> x.length() >= 4);
  return strings;
}
