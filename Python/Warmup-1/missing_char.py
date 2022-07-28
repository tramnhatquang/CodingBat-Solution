# MY SOLUTION
def missing_char(str, n):
	arr = []
	for index, char in enumerate(str):
		if index != n:
			arr.append(char)
	return ''.join(arr)


# EXAMPLE SOLUTION
def missing_char(str, n):
	front = str[:n]  # up to but not including n
	back = str[n + 1:]  # n+1 through end of string
	return front + back
