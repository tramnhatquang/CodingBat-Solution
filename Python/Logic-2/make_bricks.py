# my solution
def make_bricks(small, big, goal):
	# small bricks are 1 inch each
	# big bricks are 5 inches each

	return (goal % 5) <= small and (goal - (big * 5)) <= small
