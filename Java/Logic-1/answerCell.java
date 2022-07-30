public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if (isMorning) {
    if (isMom)
      return !isAsleep;
    return false;
  } else if (!isAsleep)
    return true;
  return false;
  
    
}
