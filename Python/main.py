def equal_is_not(string: str) -> bool:
	is_count = string.count("is")
	not_count = string.count("not")
	return is_count == not_count

if __name__ == '__main__':
	assert equal_is_not("This is not") is False
	assert equal_is_not("This is notnot") is True
	assert equal_is_not("noisxxnotyynotxisi") is True
	assert equal_is_not("isisnotno7Not") is False
