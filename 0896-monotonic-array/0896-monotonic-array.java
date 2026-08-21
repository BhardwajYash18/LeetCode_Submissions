class Solution {
    public boolean isMonotonic(int[] nums) {
        int l = 0, r = 1;
        while (r < nums.length && nums[l] == nums[r] ){
            r++;
        }
        if (r == nums.length)
            return true;
        
        if (nums[l] > nums[r])
            return dec(nums);
        else 
            return inc(nums);
    }
    private boolean inc(int[] nums){
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }

    private boolean dec(int[] nums){
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] < nums[i+1]){
                return false;
            }
        }
        return true;
    }
}