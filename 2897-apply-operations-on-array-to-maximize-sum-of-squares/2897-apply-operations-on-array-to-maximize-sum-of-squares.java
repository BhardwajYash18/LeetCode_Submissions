class Solution {
    public int maxSum(List<Integer> nums, int k) {
        final long mod = 1_000_000_007;
        int[] count = new int[30];
        for (int x : nums) {
            for (int i = 0; i < 30; i++){
                count[i] += x >> i & 1;
            }
        }
        long total = 0;
        for (int i = 0; i < k; i++){
            long row = 0;
            for (int j = 0; j < 30; j++) {
                if (count[j] > i)
                    row |= 1L << j;
            }
            total = (total + row * row) % mod;
        }
        return (int) total;
    }
}