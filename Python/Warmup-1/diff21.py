# MY SOLUTION
def diff21(n):
	return (n - 21) * 2 if n > 21 else 21 - n


# EXAMPLE SOLUTION
def diff21(n):
	if n <= 21:
		return 21 - n
	else:
		return (n - 21) * 2
