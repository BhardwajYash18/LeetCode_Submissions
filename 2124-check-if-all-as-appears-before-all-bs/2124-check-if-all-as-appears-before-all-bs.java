class Solution {
    public boolean checkString(String s) {
        int a = s.length() - 1, b = 0;
        while (a != -1 && s.charAt(a) != 'a' ){
            a--;
        }
        while (b != s.length() && s.charAt(b) != 'b'){
            b++;
        }
        return b > a;

    }
}