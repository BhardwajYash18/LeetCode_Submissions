class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] lens = new int[n];

        int INF = 1000000000;
        int prv = INF, ans = INF, sum = 0;

        for (int l = 0, r = 0; r < n; r++) {
            sum += arr[r];

            while (sum > target) {
                sum -= arr[l];
                l++;
            }
            lens[r] = prv;
            if (sum == target) {
                int len = r - l + 1;
                if (l > 0) {
                    ans = Math.min(ans, len + lens[l - 1]);
                }
                lens[r] = Math.min(lens[r], len);
            }
            prv = lens[r];
        }
        return ans >= INF ? -1 : ans;
    }
}