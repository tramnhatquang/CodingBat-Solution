public boolean squirrelPlay(int temp, boolean isSummer) {
  if (isSummer)
  {
    return (temp >= 60 && temp <= 100);
  }
  // not summer
  return (temp >= 60 && temp <= 90);
}
