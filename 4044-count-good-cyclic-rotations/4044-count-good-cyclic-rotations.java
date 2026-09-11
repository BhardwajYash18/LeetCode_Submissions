class Solution {
    public int countGoodRotations(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for (int x : nums)
            sum += x;
        
        long pre = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i >= n/2) {
                if (pre != sum - pre) 
                    ans++;
                pre -= nums[i - n/2];
            }
            pre += nums[i];
        }
        return (int)ans;
    }
}