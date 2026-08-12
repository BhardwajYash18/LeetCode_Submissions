class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int maxLength = 0;
        int length = 0;
        while (right < nums.length){
            int key = nums[right];
            if (map.containsKey(key)){
                map.put(key, map.get(key)+1);
                right++;
                length++;
                if (map.get(key) > k){
                    while(map.get(key) > k){
                        int idx = nums[left];
                        map.put(idx,map.get(idx)-1);
                        left++;
                        length--;
                    }
                }

            }
            else {
                map.put(key,1);
                right++;
                length++;
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}