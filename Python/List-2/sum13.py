# my solution
def sum13(nums):
	n = len(nums)
	if n == 0:
		return 0
	for i in range(n):
		if nums[i] == 13:
			nums[i] = 0
			if i + 1 < n:
				nums[i + 1] = 0

	return sum(nums)
