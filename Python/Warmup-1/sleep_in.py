# my solution
def sleep_in(weekday, vacation):
  return not weekday or vacation

# Example solution
def sleep_in(weekday, vacation):
  if not weekday or vacation:
    return True
  else:
    return False
  # This can be shortened to: return(not weekday or vacation)
