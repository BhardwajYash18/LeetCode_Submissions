class Solution {
    public int titleToNumber(String col) {
        int sum = 0,i = col.length() - 1;
        while(i >= 0) {
            sum += Math.pow(26,(col.length() - 1 - i))*(col.charAt(i) - 'A' + 1);
            i--;
        }
        return sum;
    }
}