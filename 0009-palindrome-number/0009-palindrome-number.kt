class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false;
        var n : Int = x;
        var sum : Int = 0;
        while (n > 0) {
            val dig : Int = n % 10;
            sum = sum*10 + dig;
            n /= 10;
        }
        if (sum == x) {
            return true;
        }
        return false;
    }
}