class Solution {
    public void wiggleSort(int[] nums) {
        int[] temp = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++){
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        int l = (n - 1) / 2, r = n - 1;
        for (int i = 0; i < n; i += 2) {
            nums[i] = temp[l];
            l--;
        }
        for (int i = 1; i < n; i += 2) {
            nums[i] = temp[r];
            r--;
        }
        
    }
}