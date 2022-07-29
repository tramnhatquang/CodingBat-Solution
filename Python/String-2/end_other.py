# my solution
def end_other(a, b):
	a = a.lower()
	b = b.lower()
	return a.endswith(b) or b.endswith(a)


# example solution
def end_other(a, b):
	a = a.lower()
	b = b.lower()
	return (b.endswith(a) or a.endswith(b))
