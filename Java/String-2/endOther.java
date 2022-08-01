public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  boolean aEndsB = a.endsWith(b);
  boolean bEndsA = b.endsWith(a);
  return aEndsB || bEndsA;
  
}
