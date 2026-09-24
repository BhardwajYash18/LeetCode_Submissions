class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if (nums[i] < 10 && nums[i] == i){
                return i;
            }
            else {
                if (digitSum(nums[i]) == i){
                    return i;
                }
            }
        }
        return -1;
    }
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}