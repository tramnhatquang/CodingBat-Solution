# my solution
def date_fashion(you, date):
	if date <= 2 or you <= 2:
		return 0
	if you >= 8 or date >= 8:
		return 2
	return 1


# example solution
def date_fashion(you, date):
	## Check the <=2 case first, since it takes precedence
	## over the >=8 case.
	if (you <= 2) or (date <= 2):
		return 0
	elif (you >= 8) or (date >= 8):
		return 2
	else:
		return 1
