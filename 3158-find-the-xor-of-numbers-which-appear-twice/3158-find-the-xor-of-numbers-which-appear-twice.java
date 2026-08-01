class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq = new int[50];
        int ans = 0;

        for (int num : nums) {
            if (freq[num-1]==0) freq[num-1]++;
            else if (freq[num-1] == 1) {
                ans ^= num;
                freq[num-1]++;
            }
            else continue;
        }
        return ans;
    }
}