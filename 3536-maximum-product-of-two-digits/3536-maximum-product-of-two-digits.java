class Solution {
    public int maxProduct(int n) {
        int high = n % 10;
        n /= 10;
        int sec = n % 10;
        n /= 10;
        if (high < sec) {
            sec = high + sec;
            high = sec - high;
            sec = sec - high;
        }

        while (n > 0) {
            int dig = n % 10;
            if (dig > high) {
                sec = high;
                high = dig;
            }
            else if (dig > sec) {
                sec = dig;
            }
            n /= 10;
        }
        return sec*high;
    }
}