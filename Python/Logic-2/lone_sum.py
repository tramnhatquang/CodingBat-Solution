# my solution
def lone_sum(a, b, c):
	if a == b == c:
		return 0
	elif a == b and b != c:
		return c
	elif a == c and c != b:
		return b
	elif c == b and c != a:
		return a
	return a + b + c


# example solution
def lone_sum(a, b, c):
	sum = 0
	if a != b and a != c: sum += a
	if b != a and b != c: sum += b
	if c != a and c != b: sum += c

	return sum
