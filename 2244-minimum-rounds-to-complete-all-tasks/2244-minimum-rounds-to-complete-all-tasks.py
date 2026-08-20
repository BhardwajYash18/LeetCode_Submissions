class Solution(object):
    def minimumRounds(self, tasks):
        """
        :type tasks: List[int]
        :rtype: int
        """
        frequency = Counter(tasks)
        result = 0

        for freq in frequency.values():
            if freq == 1:
                return -1
            
            result += (freq + 2) // 3
        
        return int(result)


        