class Solution {
    public int minRotations(String s) {
        int curr = 0, n = 10;
        int i = 0;
        int res = 0;
        while (i < s.length()) {
            int tar = s.charAt(i) - '0';
            res += Math.min(Math.abs(curr - tar), 10 - Math.abs(curr - tar));
            curr = tar;
            i++;
        }
        return res;
    }
}