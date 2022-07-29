# my solution
def no_teen_sum(a, b, c):
	sum = 0
	sum += fix_teen(a)
	sum += fix_teen(b)
	sum += fix_teen(c)
	return sum


def fix_teen(n):
	if 13 <= n <= 19 and n not in [15, 16]:
		return 0
	return n
