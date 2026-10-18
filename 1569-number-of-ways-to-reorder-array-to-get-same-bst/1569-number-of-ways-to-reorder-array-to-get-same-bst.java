class Solution {
    private static final long mod = 1_000_000_007L;

    public int numOfWays(int[] nums) {
        int n = nums.length;
        int[] born = new int[n + 2];  
        Arrays.fill(born, -1);
        for (int i = 0; i < n; i++) born[nums[i]] = i;

        long fact = 1, sizes = 1;  
        for (int k = 2; k <= n; k++) fact = fact * k % mod;
        int[] stack = new int[n + 2];  
        int top = 0;
        for (int v = 1; v <= n + 1; v++) {
            while (born[stack[top]] > born[v]) {  
                top--;
                sizes = sizes * (v - stack[top] - 1) % mod;  
            }
            stack[++top] = v;
        }
        return (int) ((fact * power(sizes, mod - 2) - 1 + mod) % mod);  // n! / sizes - 1
    }

    private long power(long b, long e) {
        long r = 1;
        for (b %= mod; e > 0; e >>= 1, b = b * b % mod)
            if ((e & 1) == 1) r = r * b % mod;
        return r;
    }
}