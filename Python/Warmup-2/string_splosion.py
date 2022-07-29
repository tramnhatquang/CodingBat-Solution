# MY SOLUTION
def string_splosion(str):
	res = ''
	for i in range(len(str)):
		res += str[:i + 1]
	return res


# EXAMPLE SOLUTION
def string_splosion(str):
	result = ""
	# On each iteration, add the substring of the chars 0..i
	for i in range(len(str)):
		result = result + str[:i + 1]
	return result
