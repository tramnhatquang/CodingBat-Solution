# my solution

def double_char(str):
	res = ''
	for char in str:
		res += char * 2

	return res


# example solution
def double_char(str):
	result = ""
	for i in range(len(str)):
		result += str[i] + str[i]
	return result
