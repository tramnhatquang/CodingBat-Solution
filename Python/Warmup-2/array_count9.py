# MY SOLUTION
def array_count9(nums):
	return nums.count(9)


# EXAMPLE SOLUTION
def array_count9(nums):
	count = 0
	# Standard loop to look at each value
	for num in nums:
		if num == 9:
			count = count + 1

	return count
