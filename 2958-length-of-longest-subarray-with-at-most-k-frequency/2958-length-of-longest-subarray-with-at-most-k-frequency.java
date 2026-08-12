class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        int maxLength = 0;
        int length = 0;

        while (right < nums.length) {
            int key = nums[right];

            map.put(key, map.getOrDefault(key, 0) + 1);
            right++;
            length++;

            while (map.get(key) > k) {
                int idx = nums[left];
                map.put(idx, map.get(idx) - 1);
                left++;
                length--;
            }

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}