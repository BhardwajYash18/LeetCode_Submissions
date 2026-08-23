class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            int num = (int) c;
            sb.append(toBinary(num));
        } 
        return pallindrome(sb.toString());
    }
    private String toBinary(int num) {
        return String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
    }
    private boolean pallindrome(String s) {
        for (int i = 0; i < s.length()/2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}