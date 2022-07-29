# my solution
def sum67(nums):
	n = len(nums)
	total = i = 0
	while i < n:
		if nums[i] == 6:
			while nums[i] != 7:
				i += 1
		else:
			total += nums[i]
		i += 1
	return total
