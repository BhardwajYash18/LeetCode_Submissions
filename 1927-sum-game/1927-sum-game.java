class Solution {
    public boolean sumGame(String num) {
        double res = 0, n = num.length();
        for (int i = 0; i < n; i++){
            double sign;
            if (i < n/2){
                sign = 1;
            }
            else {
                sign = -1;
            }
            double value;
            if (num.charAt(i) == '?'){
                value = 4.5;
            }
            else {
                value = num.charAt(i) - '0';
            }
            res += sign * value;
        }

        if (res != 0.0){
            return true;
        } else {
            return false;
        }
    }
}