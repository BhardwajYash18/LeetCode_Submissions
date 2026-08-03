class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int n : nums) 
            res = Math.max(res,n);
        
        int currMax = 1, currMin = 1;

        for (int n : nums) {
            int temp = currMax * n;
            currMax = Math.max(temp, Math.max(currMin*n , n));
            currMin = Math.min(temp, Math.min(currMin*n , n));

            res = Math.max(res,currMax);
        }
        return res;
    }
}