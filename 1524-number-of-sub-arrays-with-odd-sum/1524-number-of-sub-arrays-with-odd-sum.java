class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1_000_000_007;
        int even = 1, odd = 0;
        long ans = 0;
        int par = 0;
        for (int x : arr) {
            par = (par + x) % 2;
            if ((par & 1) == 1) {
                ans = (ans + even) % mod;
                odd++;
            }
            else {
                ans = (ans + odd) % mod;
                even++;
            }
        }
        return (int) ans;
    }
}