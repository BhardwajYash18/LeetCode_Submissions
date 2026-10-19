class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, occ = 0;
        for (int n : nums) {
            if (n == target){
                occ++;
            }
            else if( n < target){
                count++;
            }
        }
        List<Integer> result = new ArrayList<>();
        while (occ > 0) {
            result.add(count);
            count++;
            occ--;
        }
        return result;
    }
}