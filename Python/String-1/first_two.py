# my solution
def first_two(str):
	n = len(str)
	if n < 2:
		return str
	return str[:2]


# example solution
def first_two(str):
	if len(str) >= 2:
		return str[:2]
	else:
		return str
