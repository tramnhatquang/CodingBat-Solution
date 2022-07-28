# MY SOLUTION
def front_back(str):
	if len(str) <= 1:
		return str
	front, back = str[0], str[-1]
	return back + str[1:-1] + front


# EXAMPLE SOLUTION
def front_back(str):
	if len(str) <= 1:
		return str

	mid = str[1:len(str) - 1]  # can be written as str[1:-1]

	# last + mid + first
	return str[len(str) - 1] + mid + str[0]
