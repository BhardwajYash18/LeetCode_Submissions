class Solution {
    public int longestSubsequence(int[] nums) {
        int[] arr = nums.clone();

        if (arr.length == 0) {
            return 0;
        }

        int xorSum = 0;
        for (int num : arr) {
            xorSum ^= num;
        }

        if (xorSum != 0) {
            return arr.length;
        } 
        else {
            boolean containsNonZero = false;
            for (int num : arr) {
                if (num != 0) {
                    containsNonZero = true;
                    break;
                }
            }

            if (containsNonZero) {
                return arr.length - 1;
            } else {
                return 0;
            }
        }
    }
}