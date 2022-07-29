# my solution
def sum2(nums):
	n = len(nums)
	if n == 0:
		return 0
	elif n == 1:
		return nums[0]
	return sum(nums[:2])
