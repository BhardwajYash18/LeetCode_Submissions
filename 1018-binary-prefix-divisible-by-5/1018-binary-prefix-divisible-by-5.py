class Solution(object):
    def prefixesDivBy5(self, nums):
        result = []
        remainder = 0

        for n in nums:
            remainder = (remainder * 2 + n) % 5
            result.append(remainder == 0)

        return result