class Solution(object):
    def check(self, nums):
        a = sorted(nums)
        for i in range(1,len(nums)+1):
            k=i%len(nums)
            b = a[k:] + a[:k]
            if nums == b :
                return True
        return False
