class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int l = 0, r = 0;
        String ans = "";
        int num1 = 0;
        while (r < n) {
            if (s.charAt(r) == '1') {
                num1++;
            }
            
            while (num1 > k) {
                if (s.charAt(l) == '1') {
                    num1--;
                }
                l++;
            }

            if (num1 == k) {
                while (s.charAt(l) == '0') {
                    l++;
                }

                String curr = s.substring(l, r + 1);
                if (ans.equals("")
                        || curr.length() < ans.length()
                        || (curr.length() == ans.length()
                            && curr.compareTo(ans) < 0)) {

                    ans = curr;
                }
                l++;
                num1--;
            }
            r++;
        }
        return ans;
    }
}