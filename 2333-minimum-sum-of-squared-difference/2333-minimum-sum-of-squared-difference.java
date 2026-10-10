class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] diff = new int[100001];
        long k = (long) k1 + k2, sum = 0;
        int maxDiff = Integer.MIN_VALUE, n = nums1.length;
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums1[i] - nums2[i]);
            diff[x]++;
            sum += x;
            maxDiff = Math.max(maxDiff, x);
        }
        if (sum <= k) 
            return 0;
        
        for (int i = maxDiff; i > 0 && k > 0; i--) {
            long move = Math.min(k, diff[i]);
            diff[i] -= move;
            diff[i - 1] += move;
            k -= move;
        }
        long res = 0;
        for (int i = 0; i <= maxDiff; i++) {
            res += (long) i*i*diff[i];
        }
        return res;
    }
}