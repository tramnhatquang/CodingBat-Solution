# my solution
def left2(str):
	n = len(str)
	if n == 2:
		return str

	# now the length > 2
	first_2_chars = str[:2]
	return str[2:] + first_2_chars


# example solution
def left2(str):
	return str[2:] + str[:2]
