class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = k;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }

        while (true) {
            if (!set.contains(n)){
                break;
            }
            n += k;
        }
        return n;
    }
}