class Solution {
    private int gcd(int min , int max) {
        while (min != 0) {
            int temp = min;
            min = max%min;
            max = temp;
        }
        return max;
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        return gcd(min,max);
    }
}