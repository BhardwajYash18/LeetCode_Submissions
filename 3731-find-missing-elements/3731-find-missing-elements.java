class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int curr = nums[0];
        for (int i = 0 ; i < nums.length ; curr++,i++){
            if (curr < nums[i]) {
                result.add(curr);
                i--;
            }
        }
        return result;
    }
}