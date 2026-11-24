class Solution {
    public int maxLength(int[] nums) {
        int best = 2, l = 0, prod = 1;
        for (int r = 0; r < nums.length; r++) {
            int x = nums[r];
            while (gcd(prod, x) > 1)
                prod /= nums[l++];
            prod *= x;
            best = Math.max(best, r - l + 1);
        }
        return best;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}