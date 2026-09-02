class Solution {
    public boolean uniformArray(int[] nums1) {
        int even = Integer.MAX_VALUE, odd = Integer.MAX_VALUE;
        for (int n : nums1) {
            if ((n&1) == 0){
                even = Math.min(even,n);
            }
            else {
                odd = Math.min(odd,n);
            }
        }
        return ((even > odd) || even == Integer.MAX_VALUE || odd == Integer.MAX_VALUE);
    }
}