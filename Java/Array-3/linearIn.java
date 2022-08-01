public boolean linearIn(int[] outer, int[] inner) {
  // use two indices for two arrays
  int innerIndex = 0, outerIndex = 0;
  while (innerIndex < inner.length && outerIndex < outer.length)
  {
    if (inner[innerIndex] > outer[outerIndex])
      outerIndex++;
    else if (inner[innerIndex] == outer[outerIndex])
    {
      outerIndex++;
      innerIndex++;
    } else
      return false;
    
  }
  return innerIndex == inner.length;
}
