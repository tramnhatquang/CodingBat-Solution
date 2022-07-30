public boolean cigarParty(int cigars, boolean isWeekend) {
  if (isWeekend)
  {
    return cigars >= 40;
  }
  return (40 <= cigars && cigars <= 60);
}
