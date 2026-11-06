class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int l = 0, r = nums.length -1;
        int i = nums.length - 1;
        while (l <= r) {
            if (nums[l]*nums[l] > nums[r]*nums[r]) {
                arr[i] = nums[l]*nums[l];
                i--;
                l++;
            }
            else {
                arr[i] = nums[r]*nums[r];
                i--;
                r--;
            }
        }
        return arr;
    }
}