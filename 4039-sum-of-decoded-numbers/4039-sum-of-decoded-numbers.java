class Solution {
    static final long MOD = 1_000_000_007L;
    public int sumDecoded(long[] nums) {
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int w = (int)(nums[i] % 10);
            long d = nums[i] / 10;

            String s = String.valueOf(d);

            long x = Long.parseLong(s.substring(0, w));
            long y = Long.parseLong(s.substring(w));

            ans = (ans + power(x, y)) % MOD;
        }
        return (int) ans;
    }

    private long power(long x, long y) {
        long result = 1;
        x %= MOD;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            y /= 2;
        }
        return result;
    }
}