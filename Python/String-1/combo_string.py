# my solution
def combo_string(a, b):
	a_length, b_length = len(a), len(b)
	if a_length < b_length:
		return a + b + a
	else:
		return b + a + b

# example solution
# None
