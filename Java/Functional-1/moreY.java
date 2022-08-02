public List<String> moreY(List<String> strings) {
  strings.replaceAll(x -> "y" + x + "y");
  return strings;
}
