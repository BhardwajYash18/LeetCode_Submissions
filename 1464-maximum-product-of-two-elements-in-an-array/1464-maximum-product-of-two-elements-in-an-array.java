class Solution {
    public int maxProduct(int[] nums) {
        int peak = Integer.MIN_VALUE;
        int peak2 = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n >= peak) {
                peak2 = peak;
                peak = n;
            }
            if (n >= peak2 && n < peak) {
                peak2 = n;
            }
        }
        return (peak-1)*(peak2-1);
    }
}