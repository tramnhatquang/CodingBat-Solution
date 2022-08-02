public List<String> noX(List<String> strings) {
  strings.replaceAll(x -> x.replace("x", ""));
  return strings;
}
