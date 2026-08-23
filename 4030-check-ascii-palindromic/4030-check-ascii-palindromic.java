class Solution {
    public boolean isPalindromic(String s) {
        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()){
            int num = (int) c;
            sb.append(String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0'));
        } 
        for (int i = 0; i < sb.length()/2 ; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length()-1-i))
                return false;
        }
        return true;
    }
}