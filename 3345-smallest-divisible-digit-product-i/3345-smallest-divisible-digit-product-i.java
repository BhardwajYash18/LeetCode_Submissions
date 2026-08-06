class Solution {
    public int smallestNumber(int n, int t) {
        int pro = 1;
        int num = n;
        while (n > 0) {
            pro *= n % 10;
            if (pro == 0) return num;
            n /= 10;
        }
        if (pro % t == 0) {
            return num;
        }
        else {
            return smallestNumber(num + 1,t);
        }
    }
}