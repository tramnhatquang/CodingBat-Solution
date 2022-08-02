public List<String> no34(List<String> strings) {
  strings.removeIf(x -> x.length() == 3 || x.length() == 4);
  return strings;
}
