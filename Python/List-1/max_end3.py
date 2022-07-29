# my solution
def max_end3(nums):
	n = len(nums)
	max_number = max(nums[0], nums[-1])
	return [max_number] * n


# example solution
def max_end3(nums):
	big = max(nums[0], nums[2])
	nums[0] = big
	nums[1] = big
	nums[2] = big
	return nums
