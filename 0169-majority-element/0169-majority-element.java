class Solution {
    public int majorityElement(int[] nums) {
        int curr = nums[0], occ = 1;
        for (int i = 1; i < nums.length; i++) {
            if (curr == nums[i]){
                occ++;
            }
            else if (occ == 0){
                curr = nums[i];
                occ = 1;
            }
            else{
                occ--;
            }
        }
        return curr;
    }
}