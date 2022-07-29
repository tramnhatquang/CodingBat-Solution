def centered_average(nums):
  # nums.sort()
  # arr = nums[1:-1]
  # n = len(arr)
  # if n % 2 == 0:
  #   return int(((arr[int((n-1)/2)] +
  #                 arr[int(n/2)])/2.0))
  # return arr[n // 2]

  sum = 0
  for element in nums:
    sum += element
  return (sum - min(nums) - max(nums)) / (len(nums)-2)
