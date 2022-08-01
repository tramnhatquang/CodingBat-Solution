def star_out(string: str) -> str:
	res = ''
	for index, char in enumerate(string):
		if index == 0 and char != '*':
			res += char
		if index > 0 and char != '*' and string[index - 1] != '*':
			res += char
		if index > 0 and char == '*' and string[index - 1] != '*':
			res = res[:-1]
	return res


if __name__ == '__main__':
	assert star_out("ab*cd") == "ad"
	assert star_out("ab**cd") == "ad"
	assert star_out("sm*eilly") == "silly"
	assert star_out('**') == ''
	assert star_out('*') == ''
	assert star_out('') == ''
	assert star_out('abcde') == 'abcde'
