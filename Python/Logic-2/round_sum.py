# my solution

def round_sum(a, b, c):
	return round10(a) + round10(b) + round10(c)


def round10(num):
	last_digit = num % 10
	if last_digit < 5:
		return num - last_digit
	return num + (10 - last_digit)


# example solution
def round_sum(a, b, c):
	return round10(a) + round10(b) + round10(c)


def round10(num):
	mod = num % 10
	num -= mod
	if mod >= 5: num += 10
	return num
