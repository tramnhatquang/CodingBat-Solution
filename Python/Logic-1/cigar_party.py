# my solution
def cigar_party(cigars, is_weekend):
	if is_weekend:
		return cigars >= 40
	return 40 <= cigars <= 60


# example solution
def cigar_party(cigars, is_weekend):
	if is_weekend:
		return (cigars >= 40)
	else:
		return (cigars >= 40 and cigars <= 60)
