class Solution {
    public int minInsertions(String s) {
        int ans = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (close % 2 != 0) {
                    ans++;
                    close--;
                }
                close += 2;
            }
            else {
                close--;
                if (close < 0){
                    ans++;
                    close = 1;
                }
            }
        }
        return ans + close;
    }
}