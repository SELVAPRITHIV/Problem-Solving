class Solution(object):
    def moveZeroes(self, nums):
        idx = 0
        for i in range(0,len(nums)):
            if nums[i]!=0:
                nums[idx] = nums[i]
                idx+=1

        for i in range(idx,len(nums)):
            nums[i] = 0

        return nums
        