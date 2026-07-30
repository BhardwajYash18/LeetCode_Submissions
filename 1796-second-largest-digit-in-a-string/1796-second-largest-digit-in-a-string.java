class Solution {
    public int secondHighest(String s) {
        int l = -1, l2 = -1;

        for (char c : s.toCharArray()){
            if (Character.isDigit(c)) {
                int num = c - '0';
                if (num > l) {
                    l2 = l;
                    l = num;
                }
                else if (num > l2 && num < l) {
                    l2 = num;
                }
            }
        }
        return l2;
    }
}