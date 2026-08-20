class Solution(object):
    def resultArray(self, nums):
        arr1 = [nums[0]]
        arr2 = [nums[1]]
        p1, p2 = 0,0

        for i in range(2,len(nums)):
            if (arr1[p1] > arr2[p2]):
                p1 += 1
                arr1.append(nums[i])
            
            else :
                p2 += 1
                arr2.append(nums[i])
    
        return arr1 + arr2
        