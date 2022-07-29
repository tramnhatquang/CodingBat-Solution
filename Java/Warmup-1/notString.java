public String notString(String str) {
  if (!str.startsWith("not")) {
    return "not " + str;
  }
  return str;
}
