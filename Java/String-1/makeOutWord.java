public String makeOutWord(String out, String word) {
  String first = out.substring(0, out.length() / 2);
  String last = out.substring(out.length() / 2); 
  return first + word + last;
}
