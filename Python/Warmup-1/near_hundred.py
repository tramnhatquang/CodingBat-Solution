# MY SOLUTION
def near_hundred(n):
	return abs(n - 100) <= 10 or abs(n - 200) <= 10


# EXAMPLE SOLUTION
def near_hundred(n):
	return ((abs(100 - n) <= 10) or (abs(200 - n) <= 10))
