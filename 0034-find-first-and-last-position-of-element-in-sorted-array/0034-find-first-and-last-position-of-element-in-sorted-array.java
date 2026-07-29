class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int left = BS(nums,target,true);
        int right = BS(nums,target,false);
        result[0] = left;
        result[1] = right;
        return result;
    }

    private int BS(int[] nums, int target, boolean isLeft){
        int left = 0, right = nums.length-1;
        int ind = -1;

        while (left <= right) {
            int mid = left + (right - left) /2;
            if (nums[mid] > target) {
                right = mid-1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                ind = mid;
                if (isLeft) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return ind;
    }
}