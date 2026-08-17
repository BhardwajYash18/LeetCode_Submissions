class Solution {
    public int subtractProductAndSum(int n) {
        int pro = 1, sum = 0;
        while (n > 0) {
            int dig = n % 10;
            n /= 10;
            pro *= dig;
            sum += dig;
        }

        return pro - sum;
    }
}