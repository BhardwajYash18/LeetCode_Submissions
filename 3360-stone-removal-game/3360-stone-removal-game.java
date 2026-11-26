class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) return false;
        int miss = 55 - n;
        double rem = Math.round(Math.sqrt(2*miss));
        return rem%2 == 1;
    }
}