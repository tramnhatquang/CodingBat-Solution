# my solution
def first_last6(nums):
	n = len(nums)
	if n == 1:
		if nums[0] == 6:
			return True
		return False  # the first element is not 6
	else:
		return nums[0] == 6 or nums[-1] == 6
