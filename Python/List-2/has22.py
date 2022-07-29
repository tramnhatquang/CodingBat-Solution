# my solution
def has22(nums):
	n = len(nums)
	for i in range(n):
		if nums[i:i + 2] == [2, 2]:
			return True
	return False
