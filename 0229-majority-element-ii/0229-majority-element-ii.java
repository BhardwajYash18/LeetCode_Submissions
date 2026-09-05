class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int maj1 = 0, maj2 = 0, c1 = 0, c2 = 0;
        int n = nums.length;
        int tar = n / 3;
        for (int i = 0; i < n; i++) {
            if (maj1 == nums[i]){
                c1++;
            }
            else if(maj2 == nums[i]) {
                c2++;
            }
            else if (c1 == 0) {
                maj1 = nums[i];
                c1 = 1;
            }
            else if (c2 == 0) {
                maj2 = nums[i];
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int num : nums) {
            if (num == maj1)
                c1++;
            
            else if (num == maj2)
                c2++;
        }
        List<Integer> result = new ArrayList<>(2);
        if (c1 > tar)
            result.add(maj1);
        if (c2 > tar) 
            result.add(maj2);
        
        return result;
    }
}